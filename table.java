/* **********************************************************
 * Programmer: Lauren M
 * Class: CS40S
 * 
 * Assignment: 2D Arrays Exercises
 *
 * Description: Table. Is a two dimenisonal array of integers.
 * 
 * **************************************************************/
 
 public class table
 {  // begin class
    
    // *********** class constants **********
    
    
    // ********** instance variable **********
    
        int rows = 0; // the amount of rows in the table
        int columns = 0; // the amount of columns in the table
        int[][] data; // the matrix of data for the table
        
    // ********** CONSTRUCTORS ***********
    
    //*****************************************************
    // Purpose: create a table
    // Interface: IN: none
    // Returns: none
    // ****************************************************
    
        public table(int[][] data, int rows, int columns){
            this.data = new int[rows][columns];
            this.rows = rows;
            this.columns = columns;
            this.data = data;
        } // end table constructor
    
    // ********* PRINT *********
    
    //*****************************************************
    // Purpose: print the table
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void print(){
          for(int i = 0; i < rows; i++){
              for(int j = 0; j < columns; j++){
                  System.out.print(data[i][j] + ", ");
                }// end print row
                System.out.println();
            }// end print table
            System.out.println();
        } // end print table
    
    //*****************************************************
    // Purpose: print the rows backwards
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void printrowsreversed(){
          for(int i = rows; i > 0; i--){
              for(int j = 0; j < columns; j++){
                  System.out.print(data[i-1][j] + ", ");
                }// end print row
                System.out.println();
            }// end print table
            System.out.println();
        } // end print rows reversed
    //*****************************************************
    // Purpose: print the columns backwards
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void printcolsreversed(){
          for(int i = 0; i < rows; i++){
              for(int j = columns; j > 0; j--){
                  System.out.print(data[i][j-1] + ", ");
                }// end print column
                System.out.println();
            }// end print table
            System.out.println();
        } // end print columns reversed
    //*****************************************************
    // Purpose: print the entire table backwards
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void printreversed(){
          for(int i = rows; i > 0; i--){
              for(int j = columns; j > 0; j--){
                  System.out.print(data[i-1][j-1] + ", ");
                }// end print row
                System.out.println();
            }// end print table
            System.out.println();
        } // end print reversed
        
    //*****************************************************
    // Purpose: print a certain row
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void printrow(int row){
          for(int j = 0; j < columns; j++){
              System.out.print(data[row][j] + ", ");
             }// end print row
          System.out.println();
        } // end print row
        
    //*****************************************************
    // Purpose: print a certain column
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void printcolumn(int column){
          for(int i = 0; i < rows; i++){
              System.out.print(data[i][column] + ", ");
             }// end print column
          System.out.println();
        } // end print column
    
    // ********* GETTERS *********
        
    //*****************************************************
    // Purpose: return the number of rows in the table
    // Interface: IN: none
    // Returns: int rows: the number of rows in the table
    // ****************************************************
      public int getrows(){
          return this.rows;
        } // end get rows
    
    //*****************************************************
    // Purpose: return the number of columns in the table
    // Interface: IN: none
    // Returns: int columns: the number of columns in the table
    // ****************************************************
      public int getcolumns(){
          return this.columns;
        } // end columns
    
    //*****************************************************
    // Purpose: return an element in the array
    // Interface: IN: none
    // Returns: int element: an element in the tabel with the index [row][column]
    // ****************************************************
      public int getelement(int row, int column){
          int element = this.data[row][column];
          return element;
        } // end get element
    
    // ********* SUM *********
        
    //*****************************************************
    // Purpose: return the sum of every element in the table
    // Interface: IN: none
    // Returns: int s: the sum of every element in the table
    // ****************************************************
      public int gettablesum(){
          int s = 0;
          for(int i = 0; i < rows; i++){
              for(int j = 0; j < columns; j++){
                  s += data[i][j];
                }// end print row
            }// end print table
          return s;
        } // end get table sum
      
    //*****************************************************
    // Purpose: return the sum of every element in the row
    // Interface: IN: none
    // Returns: int s: the sum of every element in the row
    // ****************************************************
      public int getrowsum(int row){
          int s = 0;
              for(int j = 0; j < columns; j++){
                  s += data[row][j];
                }// end print row
          return s;
        } // end get row sum
        
    //*****************************************************
    // Purpose: return the sum of every element in the column
    // Interface: IN: none
    // Returns: int s: the sum of every element in the column
    // ****************************************************
      public int getcolsum(int column){
          int s = 0;
              for(int i = 0; i < rows; i++){
                  s += data[i][column];
                }// end print row
          return s;
        } // end get column sum
        
    //*****************************************************
    // Purpose: return the sum of two elements in the array
    // Interface: IN: none
    // Returns: int s: the sum of two elements
    // ****************************************************
      public int getelementssum(int row1, int col1, int row2, int col2){
          int s = data[row1][col1] + data[row2][col2];
          return s;
        } // end get elements sum
        
    // ********* AVERAGE ********* 
        
    //*****************************************************
    // Purpose: return the average of every element in the table
    // Interface: IN: none
    // Returns: double a: the average of every element in the table
    // ****************************************************
      public double gettableaverage(){
          double a = 0;
          for(int i = 0; i < rows; i++){
              for(int j = 0; j < columns; j++){
                  a += data[i][j];
                }// end print row
            }// end print table
          return a / (rows * columns);
        } // end get table average
      
    //*****************************************************
    // Purpose: return the average of every element in the row
    // Interface: IN: none
    // Returns: double a: the average of every element in the row
    // ****************************************************
      public double getrowaverage(int row){
          double a = 0;
              for(int j = 0; j < columns; j++){
                  a += data[row][j];
                }// end print row
          return a / columns;
        } // end get row average 
        
    //*****************************************************
    // Purpose: return the average of every element in the column
    // Interface: IN: none
    // Returns: double a: the average of every element in the column
    // ****************************************************
      public double getcolaverage(int column){
          double a = 0;
              for(int i = 0; i < rows; i++){
                  a += data[i][column];
                }// end print row
          return a / rows;
        } // end get column average
    
    // ********** SETTERS **********
    
    //*****************************************************
    // Purpose: change a particular element in the table
    // Interface: IN: none
    // Returns: none
    // ****************************************************
      public void changeelementvalue(int row, int column, int value){
          data[row][column] = value;
        } // end change element value
    
 }  // end class