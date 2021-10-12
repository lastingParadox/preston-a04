/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.List;
import java.util.Map;

public class Solution42 {

    private String listOutput(List<Map<String, String>> employees) {
        //Returns the table containing the employees' last names, first names, and salaries.
        StringBuilder output = new StringBuilder();

        output.append(String.format("%-10s%-10s%s%n", "Last", "First", "Salary"));
        output.append(String.format("--------------------------%n"));

        for (Map<String, String> employee : employees) {
            output.append(String.format("%-10s%-10s%s%n", employee.get("last_name"),
                                                        employee.get("first_name"), employee.get("salary")));
        }

        return String.valueOf(output);
    }

    public void main(String[] args) {
        //Create new EmployeeList "lister"
        //Create new Solution42 "printer"

        //Try creating a FileWrite "out" that writes to "exercise42_output.txt"

            //Try creating List of Maps "employees"
                //employees is set equal to lister.createEmployeeList()

            //String "table" is set equal to printer.listOutput(employees)

            //Print "table" to console
            //Write "table" to out
    }

}
