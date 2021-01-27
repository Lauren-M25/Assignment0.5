/********************************************************************
 * Programmer: Lauren M
 * Class: CS40S
 *
 * Assignment: Assignment 0.5
 *
 * Description: Creates table objects and uses the MatrixMath method to 
 * perform operations on them.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class Assignment0point5 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;       // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ :]+"; // delimiter string for splitting input string
        String[] tokens;        // string array for gathering input
        
        String tabSpace = "      "; // six spaces
        String nl = System.lineSeparator(); // new line character for file writing
        
        table[] tables = new table[10];
        MatrixMath MatrixMath = new MatrixMath();
        
    // ***** create objects *******
    
        BufferedReader fin = new BufferedReader(new FileReader("MatrixData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name: Lauren M");
        System.out.println("Class: CS40S");
        System.out.println("Assignment: A0.5");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name: Lauren M" + nl;
        bannerOut += "Class: CS40S" + nl;
        bannerOut += "Assignment: A0.5" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);
        
    // ************************ get input **********************

        strin = fin.readLine();
        int m = 0;
        
        while(strin != null){
            tokens = strin.split(delim); // set tokens
            int rows = Integer.parseInt(tokens[0]); // set the first integer as the number of rows
            int columns = Integer.parseInt(tokens[1]); // set the second integer as the number of columns
            int[][] t = new int[rows][columns]; // create a variable matrix

            for(int i = 0; i < rows; i++){
                strin = fin.readLine();
                tokens = strin.split(delim);
                for(int j = 0; j < columns; j++){
                    t[i][j] = Integer.parseInt(tokens[j]); // load t with the integer at index [i][j]
                } // end load row
            } // end load table
            tables[m] = new table(t, rows, columns); // create a table with the dimensions and data of t
            m++; // next index in the array
            strin = fin.readLine(); // loop update
        }
        

    // ************************ processing ***************************
        
        System.out.println("Add two matrices.");
        
        tables[0].print();
        System.out.println("+" + nl);
        tables[1].print();
        System.out.println("=" + nl);
        
        table t = MatrixMath.getSum(tables[0],tables[1]);
        t.print();
        
        System.out.println("Scalar multiplication.");
        
        tables[2].print();
        System.out.println("*" + nl);
        System.out.println("3" + nl);
        System.out.println("=" + nl);
        t = MatrixMath.getProduct(tables[2], 3);
        t.print();
        
        System.out.println("Multiply two matrices.");
        
        tables[3].print();
        System.out.println("*" + nl);
        tables[4].print();
        System.out.println("=" + nl);
        t = MatrixMath.getDotProduct(tables[3], tables[4]);
        t.print();
        
        System.out.println("Transposition.");
        
        tables[5].print();
        System.out.println("transpose" + nl);
        t = MatrixMath.transpose(tables[5]);
        t.print();
        
    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of processing");
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
}  // end class
