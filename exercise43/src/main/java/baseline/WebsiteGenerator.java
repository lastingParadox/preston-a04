package baseline;

public class WebsiteGenerator {
    //Create private String siteName
    //Create private String author
    //Create private String filePath
    //Create private boolean js = false
    //Create private boolean css = false

    //Create new Scanner "input"

    WebsiteGenerator(String siteName, String author, String filePath) {
        //This siteName = siteName
        //This author = author
        //This filePath = filePath + "/website/" + siteName (lowercase, replacing spaces with underscores)

        //Create new File(filePath).mkdirs() (Make a directory)
    }

    private String validateResponse(String response) {
        //Loop
            //If response = y or response = n (ignore case):
                //return response
            //Else:
                //Prompt "Invalid response, please input y/n."
                //Response = user's input
        return null;
    }

    public void createFolders() {
        //Prompt the user if they would want a folder for JavaScript
            //Validate the response is y/n
            //If so:
                //Create new File(filePath + "/js").mkdirs() (Make a directory)
                //js = true
        //Prompt the user if they would want a folder for CSS
            //Validate the response is y/n
            //If so:
                //new File(filePath + "/js").mkdirs() (Make a directory)
                //css = true
    }

    public void createHTML() {
        //Create new FileWriter 'out' set to filePath + "/index.html"
        //Create new StringBuilder "html"

        //Append "<head>%n    <title>'siteName'</title>%n" to html
        //Append "    <meta name="author" content='author'>%n</head>" to html

        //Write html to index.html
    }

    public String returnOutput() {
        //Create new StringBuilder 'output'

        //Append "Created ./website/'siteName'" to output
        //Append "%nCreated ./website/'siteName'/index.html%n" to output

        //if js is true:
            //Append "%nCreated ./website/'siteName'/js/" to output

        //if css is true:
            //Append "%nCreated ./website/'siteName'/css/" to output

        //return string value of output
        return null;
    }


}
