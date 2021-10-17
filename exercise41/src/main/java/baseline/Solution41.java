/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution41 {

    public void writeOutput(File outputFile, String output) {
        //Writes the output given to the file given
        try (FileWriter out = new FileWriter(outputFile)) {
            out.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) {
        //Create new NameSorter "sorter" with constructor new File("./data/exercise41_input.txt")

        //Create new List of Strings "names" and set it equal to sorter.createListOfNames()
        //names is set equal to sorter.sortNames(names)

        //String output is set equal to sorter.listOutput(names).

        //Try to write to "./data/exercise41_output.txt" with a FileWriter "out"
            //out.write(output)

        //Print output.
    }
}
