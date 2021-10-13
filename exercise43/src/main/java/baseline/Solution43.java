/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Scanner;

public class Solution43 {

    Scanner input = new Scanner(System.in);

    private String validateResponse(String response) {
        //Validates that the user input either "y" or "n"
        while(true) {
            if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n"))
                return response;
            else {
                System.out.print("Invalid response, please input y or n.");
                response = input.nextLine();
            }
        }
    }

    public static void main(String[] arg) {
        //Create new Scanner "input"

        //Prompt the user for the site name
        //String siteName = user's input

        //Prompt the user for the author
        //String author = user's input

        //Create new WebsiteGenerator "generator" with constructors 'siteName', 'author', and "../exercise43/data/"

        //Prompt the user if they would want a folder for JavaScript
            //Validate the response is y/n
            //If so:
                //generator.createFolder("js")

        //Prompt the user if they would want a folder for CSS
            //Validate the response is y/n
            //If so:
                //generator.createFolder("css")


        //generator.createFolders()
        //generator.createHTML()
        //String output = generator.printOutput()

        //Print output
    }
}
