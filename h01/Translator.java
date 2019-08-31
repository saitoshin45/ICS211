/**
 * 
 */
package edu.ics211.h01;

import java.awt.List;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author satos
 *
 */
public class Translator implements Translate {

	/**
	 * 
	 */
	public Translator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see edu.ics211.h01.Translate#asBinaryString(java.io.InputStream)
	 */
	@Override
	public String asBinaryString(InputStream in)  {
	//create an instance of a BitReader class 
	 BitReader br;
	//create an instance of a StringBuilder class, found this at https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
   StringBuilder sb = new StringBuilder(); 
  try {
    br = new BitReader(in);
    /*a boolean variable to check the loop of the BitReader*/
    boolean isDone = false;
    while(isDone != true) {
      //append the bits to the string builder, found this at https://www.geeksforgeeks.org/stringbuilder-append-method-in-java-with-examples/
      sb.append(br.readAsInt());
      if(br.isDone()) {
        isDone = true;
      }
    }
  } catch (IOException e) {
    //do nothing 
  }	   
	 return sb.toString();
	}
	


	

	/* (non-Javadoc)
	 * @see edu.ics211.h01.Translate#asHexadecimalString(java.io.InputStream)
	 */
	@Override
	public String asHexadecimalString(InputStream in) {
		//create an empty StringBuilder 
		StringBuilder sb = new StringBuilder();
		try {
		 //read a byte 
		int b = in.read();
		//loop until input is done
		while(b != -1) {
		
			//append the converted byte to StringBuilder
			String s = Integer.toHexString(b);
			if(s.length() == 1) {
				s="0"+s;
			}
			System.out.println(s);
			sb.append(s);
			b=in.read(); 
		//return the StringBuilder 
		}
		}
		catch(IOException ioe) {
			//do nothing
		}
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see edu.ics211.h01.Translate#asUtf8String(java.io.InputStream)
	 */
	@Override
	public String asUtf8String(InputStream in) {
	  //create an instance of a new BitReader 
	  BitReader br = new BitReader(in);
	  //create an empty StringBuilder
	  StringBuilder sb = new StringBuilder();
	  //found this at https://stackoverflow.com/questions/6340999/create-an-arraylist-of-bytes
	  ArrayList<Byte> bytearray = new ArrayList<Byte>();
	  
	  //create a loop to convert to the bytes and add to ArrayList
	  boolean finish = false;
	  while(finish != true) {
	    //found this at https://www.tutorialspoint.com/java/io/datainputstream_readbyte.htm
	    bytearray.add(br.readByte());
	    
	      if(br.isDone()) {
	        finish = true;
	      }
	  }
	  //recreate the ArrayList into a new Byte Array
	  //found this @ https://www.java67.com/2016/07/how-to-find-length-size-of-arraylist-in-java.html#targetText=You%20can%20use%20the%20size,called%20the%20capacity%20of%20ArrayList.
	  byte[] dataArray = new byte[bytearray.size()];
	  //found this @ https://examples.javacodegeeks.com/core-java/util/arraylist/convert-arraylist-to-object-array-example/
	  for(int i = 0; i < dataArray.length;i++) {
	    dataArray[i] = bytearray.get(i);  
	  }
	  
	  sb.append(new String(dataArray, "UTF-8"));
	  return sb.toString();
	}

}
