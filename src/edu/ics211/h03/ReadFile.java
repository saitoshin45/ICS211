package edu.ics211.h03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

/**
 * Takes a file of text with specific enconding. 
 *@author Shinya Saito 
 *  Worked with Matthew and Micheal Ito.
 *
 */


public class ReadFile implements IReadFile {

  @Override
  public String readFile(String fileName) throws IOException {
    DataInputStream in = new DataInputStream(new FileInputStream(fileName));
    
    //read the number of bytes in the String 
    int numByte = in.readInt();
    
    //build an array of byte to store the bytes
    byte[] data = new byte[numByte];
    
    //read the encoding
    Byte encode = in.readByte();
    //read the bytes for the String 
    in.read(data);
    
    String stringRead;
    
    System.out.println("Bytes read" + numByte +"\n Encoding Number:" + encode + "\nBytes that make the String" +data);
    switch (encode) {
      case 1:
        stringRead = new String(data, StandardCharsets.US_ASCII);
        break;
      case 2:
        stringRead = new String(data, StandardCharsets.UTF_16LE);
        break;
      case 3:
        stringRead = new String(data, StandardCharsets.UTF_8);
        break;
      case 4:
        stringRead = new String(data, StandardCharsets.UTF_16);
        break;
      default:
        stringRead = "";
    }
    in.close();
    
    return stringRead;
  }

}
