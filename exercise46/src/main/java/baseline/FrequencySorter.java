/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.File;
import java.util.List;
import java.util.Map;

public class FrequencySorter {

    //private File inputFile

    FrequencySorter(File inputFile) {
        //this inputFile = inputFile
    }

    public Map<String, Integer> createFrequencyMap() {
        //Create Map of String keys and integer values "wordMap"
        //try to reader inputFile with a BufferedReader "reader"
            //String line = reader.readLine()
            //while line is not null:
                //Array of strings "temp" is equal to line.split with delimiter of a space

                //Loop for each word in temp:
                    //If wordMap contains the word as a key:
                        //Increase that key's value by one.
                    //Else:
                        //Create a key as the word and set it to one.

                //line = reader.readline()
        //return wordMap
        return null;
    }

    public List<Map.Entry<String, Integer>> sortedMapList(Map<String, Integer> wordMap) {
        //List of Map entries of String keys and integer values "list" is a linked list of wordMap entries.
        //Sort list by Map.Entry.comparingByValue()
        //Reverse the list.
        //return the list.
        return null;
    }

    public String histogram(List<Map.Entry<String, Integer>> list) {
        //StringBuilder output is created
        //For each entry in the list:
            //String star is an asterisk set to repeat entry.getValue number of times.
            //Append "'entry.getKey': 'star'"
        //return String value of output
        return null;
    }
}
