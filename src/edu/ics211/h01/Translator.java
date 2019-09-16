package edu.ics211.h01;
/**
 * @author Shinya Saito 
 * worked with Micheal Ito and got help from the TA 
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Translator implements Translate {
  
  
  @Override
  public String asBinaryString(InputStream in) throws IOException {
    BitReader br;
    /*create an instance of a stringbuilder found at https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples*/
    StringBuilder sb = new StringBuilder();
    try {
      br = new BitReader(in);
      boolean isDone = false;
      while(isDone != true) 
        //append the StringBuilder found this at https://www.geeksforgeeks.org/stringbuilder-append-method-in-java-with-examples/
        sb.append(br.readAsInt());
        if(br.isDone()) 
          isDone = true; 
    }
    catch(IOException e) {
      /** do nothing**/
    }
    return sb.toString();
  }


  @Override
  public String asHexadecimalString(InputStream in) {
    /**create an empty StringBuilder**/
    StringBuilder sb = new StringBuilder();
    try {
      /**read a byte**/
      int b = in.read();
      /**loop until input is done**/
      while(b!=-1) {
        /**append the converted byte to a StringBuilder**/
        String s = Integer.toHexString(b);
        /**if the length of the String is 1**/
        if(s.length()==1) {
          s="0"+s;
          sb.append(s);
          b=in.read();
        }
        
      
     }
    }
    catch(IOException ioe) {
      /**do nothing**/
    }
    return sb.toString();
  }


  @Override
  public String asUtf8String(InputStream in) {
    /**create an instance of a StringBuilder.**/
    StringBuilder sb = new StringBuilder();
    /**create an instance of a new BitReader.**/
    BitReader br;
    try {
      br=new BitReader(in);
      //found this at https://stackoverflow.com/questions/6340999/create-an-arraylist-of-bytes
      ArrayList<Byte>ba = new ArrayList<Byte>();
      /**create a while loop statement to convert intt byte and add to ArrayList**/
      boolean finish=false;
      while(finish!=true) {
        /**found this at https://www.tutorialspoint.com/java/io/datainputstream_readbyte.htm**/
        ba.add(br.readByte());
        if(br.isDone())
          finish =true;
        /**recreate the ArrayList into a new Byte Array**/
        /**found this at https://www.java67.com/2016/07/how-to-find-length-size-of-arraylist-in-java.html#targetText=You%20can%20use%20the%20size,called%20the%20capacity%20of%20ArrayList.**/
        byte[] dataArray = new byte[ba.size()];
        /**found this at https://examples.javacodegeeks.com/core-java/util/arraylist/convert-arraylist-to-object-array-example**/
        for(int i=0;i<dataArray.length;i++) { 
          dataArray[i]=ba.get(i);}
        sb.append(new String(dataArray,"UTF-8"));
      
          
      }
       
    }
    catch(IOException e1) {
      /**do nothing**/
    }
    return sb.toString();
  }

}
