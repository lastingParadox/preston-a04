/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Solution41 {

    public List<String> createListOfNames() throws IOException {
        //Creates and returns a list of names from the exercise41_input.txt file.
        List<String> nameList = new ArrayList<>();
        //Tries to read the lines, provided the file exists.
        try (BufferedReader reader = new BufferedReader(new FileReader("../exercise41/data/exercise41_input.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                nameList.add(line);
                line = reader.readLine();
            }
        }
        return nameList;
    }

    public List<String> sortNames(List<String> names) {
        //Sorts the names in the list using the Collections.sort method
        Collections.sort(names);
        return names;
    }

    public String listOutput(List<String> names) {
        //Returns a string representing the table of sorted names.
        StringBuilder output = new StringBuilder();
        output.append(String.format("Total of %d names%n", names.size()));
        output.append("-----------------%n");
        for (String name : names) {
            output.append(String.format("%n%s", name));
        }
        return String.valueOf(output);
    }

    public static void main(String[] arg) {

        //Create new instance of Solution41 "sorter"

        //List "names" is equal to sorter.createArrayOfNames()
        //names is equal to sorter.sortNames()

        //String "output" is equal to sorter.listOutput()
        //Print output to terminal
        //Write output to "exercise41_output.txt"
    }
}
