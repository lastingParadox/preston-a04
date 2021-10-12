/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    EmployeeList test = new EmployeeList();

    @Test
    void createEmployeeTest() {
        //Tests createEmployeeList(), comparing result to Bruce Wayne as a mapped employee.
        Map<String, String> expected = new HashMap<>();

        expected.put("last_name", "Wayne");
        expected.put("first_name", "Bruce");
        expected.put("salary", "Unfathomable");

        Map<String, String> actual = test.createEmployee("Wayne", "Bruce", "Unfathomable");

        assertEquals(expected, actual);
    }

    @Test
    void createEmployeeListTest() throws IOException {
        //Tests createEmployeeList(), comparing result to a manually allocated list.
        List<Map<String, String>> expected = new ArrayList<>();

        expected.add(test.createEmployee("Ling", "Mai", "55900"));
        expected.add(test.createEmployee("Johnson", "Jim", "56500"));
        expected.add(test.createEmployee("Jones", "Aaron", "46000"));
        expected.add(test.createEmployee("Jones", "Chris", "34500"));
        expected.add(test.createEmployee("Swift", "Geoffrey", "14200"));
        expected.add(test.createEmployee("Xiong", "Fong", "65000"));
        expected.add(test.createEmployee("Zarnecki", "Sabrina", "51500"));

        List<Map<String, String>> actual = new ArrayList<>();
        //Tries to set actual to the list of employees in "exercise42_input.txt"
        try {
            actual = test.createEmployeeList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(expected, actual);
    }

}