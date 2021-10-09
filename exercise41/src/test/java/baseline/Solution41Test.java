/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Solution41 test = new Solution41();

    @Test
    void createListOfNamesTest() {
        //Tests createListOfNames(), comparing result to a manually allocated list
        List<String> actual = new ArrayList<>();
        try {
            actual = test.createListOfNames();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");

        assertEquals(expected, actual);
    }

    @Test
    void sortNamesTest() {
        //Tests sortNames(), comparing output to a manually sorted list.
        List<String> names = new ArrayList<>();
        try {
            names = test.createListOfNames();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> actual = new ArrayList<>();
        actual = test.sortNames(names);

        List<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        assertEquals(expected, actual);
    }
}