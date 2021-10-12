/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EmployeeList {

    public Map<String, String> createEmployee(String last, String first, String salary) {
        //Create a new map "temp"

        //Put last for "last_name" in temp
        //Put first for "first_name" in temp
        //Put salary for "salary" in temp

        //Return temp
        return null;
    }

    public List<Map<String, String>> createEmployeeList() throws IOException {
        //Create List "employees"

        //Try creating a BufferedReader "reader" that reads from "exercise42_input.txt"
            //Create string "line" equal to reader.readline()
            //While line is not null:
                //String array "employee" is equal to line split by commas
                //Add createEmployee(employee[0], employee[1], employee[2]) to employees
                //Line is set equal to the next line.

        //Return employees
        return null;
    }
}
