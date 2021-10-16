/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.File;
import java.util.List;

public class FileReplace {

    //Create new private List of strings "lines"
    //Create new private final String "outputPath"

    FileReplace(File path) {
        //Create new list of Strings "lines"
        //Try to read from the file given (BufferedReader "reader)
            //outputPath = path.getParent()
            //String line is equal to reader.readLine()
            //While line is not null:
                //Add the current line to lines
                //Line is equal to the next line
        //This lines is equal to lines
    }

    public List<String> replaceWord(String originalWord, String newWord) {
        //For each line in lines:
            //Set line to line.replace("originalWord", "newWord")
        //return lines
        return null;
    }

    public String getOutputPath() {
        //Returns outputPath
        return null;
    }

    public void writeFile(File file) {
        //Try to create a FileWriter "out" to write to file
            //Create a new StringBuilder outputText
            //For each line in lines:
                //Append line to outputText
                //If line is not last line:
                    //Append "%n" to output
        //file.write(String value of outputText)
    }

    @Override
    public String toString() {
        //Converts all lines to a string. Lines are separated by a new line indicator.
        //Create a new StringBuilder output
        //For each line in lines:
            //Append line to output
            //If line is not last line:
                //Append "%n" to output
        //return String value of output
        return null;
    }

}
