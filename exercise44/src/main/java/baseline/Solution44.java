/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class Solution44 {

    public ProductList createProductList() {
        //Create new Gson "gson"
        //Create new ProductList "products"
        //Try to read from "./data/exercise44_input.json"
            //If successful, products = gson taking the info from the json file
        //return products
        return null;
    }

    private String promptUser() {
        //Prompt "What is the product name?"
        //return user input
        return null;
    }

    public Item getListItem(ProductList products, String response) {
        //Create new Item
        //Loop:
            //For each item in products.getItems():
                //If response equals (ignore case) item.getName():
                    //temp = item
                    //break the loop
            //If temp is equal to an item:
                //break the loop
            //Else:
                //Prompt the user via promptUser()

        //return temp
        return null;
    }

    public static void main(String[] arg) {
        //Create new Solution44 "prompter"
        //Create new ProductList "products" equal to prompter.createProductList()

        //String "response" = prompter.promptUser()

        //Create new Item "chosenItem" equal to prompter.getListItem()

        //Print chosenItem
    }

}
