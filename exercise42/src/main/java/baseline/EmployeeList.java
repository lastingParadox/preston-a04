/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {

    public Map<String, String> createEmployee(String last, String first, String salary) {
        //Creates a map (an employee) from a line in "exercise42_input.txt"
        Map<String, String> temp = new HashMap<>();

        temp.put("last_name", last);
        temp.put("first_name", first);
        temp.put("salary", salary);

        return temp;
    }

    public List<Map<String, String>> createEmployeeList() throws IOException {
        //Creates a list of employees (maps) for eventual tabular output
        List<Map<String, String>> employees = new ArrayList<>();

        //Tries to read from "exercise42_input.txt" each employee (each line)
        try (BufferedReader reader = new BufferedReader(new FileReader("../exercise42/data/exercise42_input.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] employee = line.split(",");
                employees.add(createEmployee(employee[0], employee[1], employee[2]));
                line = reader.readLine();
            }
        }
        return employees;
    }
}
