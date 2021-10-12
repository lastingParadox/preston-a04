/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution42 {

    private String listOutput(List<Map<String, String>> employees) {
        //Returns the table containing the employees' last names, first names, and salaries.
        StringBuilder output = new StringBuilder();

        output.append(String.format("%-10s%-10s%s%n", "Last", "First", "Salary"));
        output.append("--------------------------");

        for (Map<String, String> employee : employees) {
            output.append(String.format("%n%-10s%-10s%s", employee.get("last_name"),
                                                        employee.get("first_name"), employee.get("salary")));
        }

        return String.valueOf(output);
    }

    public static void main(String[] arg) throws IOException {
        //Based on a list of employees in exercise42_input.txt, outputs the list of employees in a tabular format.
        EmployeeList lister = new EmployeeList();
        Solution42 printer = new Solution42();

        //Tries to write to exercise42_output.txt. Closes the writer after the output is written.
        try (FileWriter out = new FileWriter("../exercise42/data/exercise42_output.txt")) {

            List<Map<String, String>> employees = new ArrayList<>();
            try {
                employees = lister.createEmployeeList();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String output = printer.listOutput(employees);

            System.out.println(output);
            out.write(output);
        }
    }
}
