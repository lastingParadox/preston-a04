/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.File;

public class Solution45 {

    //Create new final static Scanner "input"

    private String promptUser() {
        //Print "What is the name of the output file?"
        //return user's input
        return "";
    }

    public File validateFile(String fileName, String outputPath) {
        //Create new File "output" = 'outputPath'+ "/'fileName'.txt"
        //While the file already exists:
            //Print "Sorry, that file already exists."
            //fileName = promptUser()
            //output = new File ('outputPath'+ "/'fileName'.txt")
        //return output
        return null;
    }

    public static void main(String[] arg) {
        //Create new Solution45 "prompter"
        //Create new FileReplace "replacer" with String "./data/exercise45_input.txt"
        //Create new Scanner "input"

        //String outputName = prompter.promptUser()

        //Replace the chosen word replacer.replaceWord("utilize", "use")
        //(Replaces capitalized word just in case) replacer.replaceWord("Utilize", "Use")

        //New file "outputFile" = prompter.validateFile(outputName, replacer.getOutputPath

        //replacer.writeFile(outputFile)

        //Print replacer.toString()
    }
}
