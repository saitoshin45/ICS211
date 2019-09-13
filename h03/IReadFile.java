package edu.ics211.h03;
/**
 * Interface for the Read file java.
 * 
 * @author Cam Moore
 *
 */
public interface IReadFile{
    /**
     * Reads in the given file and returns the contents of the file as a string.
     * <p>The file has the following format:</p>
     * <ul>
     *   <li>An integer, the number of bytes the String has.</li>
     *   <li>A byte, the encoding of the String.</li>
     *   <ol>
     *     <li>StandardCharsets.US_ASCII</li>
     *     <li>StandardCharsets.UTF_16LE</li>
     *     <li>StandardCharsets.UTF_8</li>
     *     <li>StandardCharsets.UTF_16</li>
     *   </ol>
     *   <li>The String as bytes.</li>
     * </ul>
     * @param fileName The name of the file.
     * @return The String that was encoded in the file.
     * @throws FileNotFoundException If there is a problem with the file name.
     * @throws IOException If there is a problem reading the file.
     */
    String readFile(String fileName) throws IOException;
  }
}
