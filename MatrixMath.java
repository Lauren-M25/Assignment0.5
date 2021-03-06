/********************************************************************
 * Programmer: Lauren M
 * Class:  CS40S
 *
 * Assignment: A0.5
 *
 * Description: performs operations on matrices.
 ***********************************************************************/

// import libraries as needed here

public class MatrixMath {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    // ********** Constructors ***********
    
    //*****************************************************
    // Purpose: create matrix math
    // Interface: IN: none
    // Returns: none
    // ****************************************************
    
        public MatrixMath(){
            
        } // end constructor
    
    //*** Getters ***
    
    //*****************************************************
    // Purpose: add two matrices
    // Interface: IN: none
    // Returns: table sum: the sum of the two matrices.
    // ****************************************************
    
    public table getSum(table t1, table t2){
        int[][] blankdata = new int[t1.getrows()][t1.getcolumns()]; // create a new matrix with blank data
        table sum = new table(blankdata, t1.getrows(), t1.getcolumns()); // create a new table
        
        if(t1.getrows() != t2.getrows() || t1.getcolumns() != t2.getcolumns()){
            System.out.println("The two matrices do not have the same dimensions and cannot be added.");
        } // end cannot add
        else {
            for(int i = 0; i < sum.getrows(); i++){
                for(int j = 0; j < sum.getcolumns(); j++){
                    sum.changeelementvalue(i, j, (t1.getelement(i,j) + t2.getelement(i,j)));
                } // end add row
            } // end add matrices
        } // end add
        
        return sum;
    }
    
    //*****************************************************
    // Purpose: multiply a matrix by an integer.
    // Interface: IN: none
    // Returns: table product: the product of the matrix and integer.
    // ****************************************************
    
    public table getProduct(table t1, int multiplier){
        int[][] blankdata = new int[t1.getrows()][t1.getcolumns()]; // create a new matrix with blank data
        table product = new table(blankdata, t1.getrows(), t1.getcolumns()); // create a new table
        
            for(int i = 0; i < product.getrows(); i++){
                for(int j = 0; j < product.getcolumns(); j++){
                    product.changeelementvalue(i, j, (t1.getelement(i,j) * multiplier));
                } // end add row
            } // end add matrices
        
        return product;
    }
    
    //*****************************************************
    // Purpose: multiply two matrices.
    // Interface: IN: none
    // Returns: table dotproduct: the dot product of the two matrices.
    // ****************************************************
    
    public table getDotProduct(table t1, table t2){
        int[][] blankdata = new int[t1.getrows()][t2.getcolumns()]; // create a new matrix with blank data
        table dotproduct = new table(blankdata, t1.getrows(), t2.getcolumns()); // create a new table
        
        if(t1.getcolumns() != t2.getrows()){
            System.out.println("The two matrices do not have the required dimensions to be multiplied.");
        } // end can't multiply
        else {
            for(int j = 0; j < t1.getrows(); j++){
                for(int k = 0; k < t2.getcolumns(); k++){
                    int product = 0; // set product variable to 0
                    for(int m = 0; m < t1.getcolumns(); m++){
                        product += t1.getelement(j, m) * t2.getelement(m, k);
                        } // end get product of row
                    dotproduct.changeelementvalue(j, k, product);
                    } // end get dot product
                } // end multiply
        } // end multiply
        
        return dotproduct;
    }
    
    //*****************************************************
    // Purpose: transpose a matrix.
    // Interface: IN: none
    // Returns: table newt: the new transposed matrix.
    // ****************************************************
    
    public table transpose(table t1){
        int[][] blankdata = new int[t1.getcolumns()][t1.getrows()]; // create a new matrix with blank data
        table newt = new table(blankdata, t1.getcolumns(), t1.getrows()); // create a new table
        
            for(int i = 0; i < newt.getrows(); i++){
                for(int j = 0; j < newt.getcolumns(); j++){
                    newt.changeelementvalue(i,j,t1.getelement(j,i));
                } // end transpose row
            } // end transpose matrix
        
        return newt;
    }
    //*** Setters ***
    
} // end of public class
