/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.File;
import java.util.Scanner;

public class Solution45 {

    private static final Scanner input = new Scanner(System.in);

    private String promptUser() {
        //Prompts the user for the name of the output file.
        System.out.print("What is the name of the output file?");
        return input.nextLine();
    }

    public File validateFile(String fileName, String outputPath) {
        //As a new file is being created, verifies that the file to be written does not exist.
        //If the file to be written does exist, gets the user to enter another name.
        File output = new File(String.format("%s/%s.txt", outputPath, fileName));
        while (output.exists()) {
            System.out.println("Sorry that file already exists.");
            fileName = promptUser();
            output = new File(String.format("%s/%s.txt", outputPath, fileName));
        }
        return output;
    }

    public static void main(String[] arg) {
        //Create new Solution45 "prompter"
        //Create new FileReplace "replacer" with File "./data/exercise45_input.txt"
        //Create new Scanner "input"

        //String outputName = prompter.promptUser()

        //Replace the chosen word replacer.replaceWord("utilize", "use")
        //(Replaces capitalized word just in case) replacer.replaceWord("Utilize", "Use")

        //New file "outputFile" = prompter.validateFile(outputName, replacer.getOutputPath

        //replacer.writeFile(outputFile)

        //Print replacer.toString()
    }
}
