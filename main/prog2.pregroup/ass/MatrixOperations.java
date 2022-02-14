package ass;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MatrixOperations {
    //main method
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int choice;
        Matrices setA = new Matrices();
        Matrices setB = new Matrices();

        Introduction();
        System.out.println();
        System.out.print("...press enter to continue");
        kbd.nextLine();

//        setA.matrixA=ElementMatrixA(setA.row,setA.column); //set A table data
        //      setB.matrixB=ElementMatrixB(setB.row,setB.column); //set B table data
        do {
            showMainMenu();
            choice = enterChoice(1, 9);
            switch (choice) {
                //handles the length of the matrices
                case 1 -> {
                    int columnLength = Matrices.MatrixSizeCollumn();
                    int rowLength = Matrices.MatrixSizeRow();
                    setA.row = columnLength;
                    setA.column = rowLength;
                    setB.row = columnLength;
                    setB.column = rowLength;
                }
                //handles the data of matrix1
                case 2 -> {
                    setA.matrixA = Matrices.ElementMatrixA(setA.row, setA.column); //set A table data
                    System.out.println(" " + setA.matrixA[0][0] + " " + setA.matrixA[0][1] + " ");
                    System.out.println(" " + setA.matrixA[1][0] + " " + setA.matrixA[1][1] + " ");
                }
                //handles the data of matrix2
                case 3 -> {
                    setB.matrixB = Matrices.ElementMatrixB(setB.row, setB.column); //set B table data
                    System.out.println(" " + setB.matrixB[0][0] + " " + setB.matrixB[0][1] + " ");
                    System.out.println(" " + setB.matrixB[1][0] + " " + setB.matrixB[1][1] + " ");
                }
                case 4 -> Matrices.AddMatrixAnB(setA.row, setA.column, setA.matrixA, setB.matrixB);
                case 5 -> Matrices.SubtractMAnB();
                case 6 -> Matrices.MultiplyMAnB(setA.row, setA.column, setA.matrixA, setB.matrixB);
                case 7 -> Matrices.DisplayTranspose();
                case 8 -> Matrices.DisplayDeterminants();
                case 9 -> System.out.println("Thank you.");
            } //end switch
        } while (choice != 9);
    } //end main method


    public static void Introduction(){
        System.out.println(" ");
        System.out.println("About");
        System.out.println("---------------------------------------------");
        System.out.println("Programmers: ");
        System.out.println("Emanj Santiago");
        System.out.println("Ian Lim");
        System.out.println("Jan Michael Coloma");
        System.out.println("Luigi Caolboy");
        System.out.println("Yuan Angelo Kim");
    }//end of Introduction Method

    /*
    enterChoice method will validate the users input if it is within the selection
     */
    public static int enterChoice(int min, int max) {
        Scanner kbd = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input the number corresponding to your choice: ");
            choice = kbd.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " +
                        min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    }//end of enterChoice


    public static void showMainMenu() {
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("|                             Main Menu                            |");
        System.out.println("|  What do you want to do?                                         |");
        System.out.println("|       1. Enter the length of the matrices                        |");
        System.out.println("|       2. Enter elements of Matrix A                              |");
        System.out.println("|       3. Enter elements of Matrix B                              |");
        System.out.println("|       4. Add Matrix A and Matrix B                               |");
        System.out.println("|       5. Subtract Matrix A and Matrix B                          |");
        System.out.println("|       6. Multiply Matrix A and Matrix B                          |");
        System.out.println("|       7. Display Transpose of Matrix A and Matrix B              |");
        System.out.println("|       8. Display the determinants of Matrix A and                |");
        System.out.println("|          Matrix B if Matrices A and B are square matrix          |");
        System.out.println("|       9. Quit                                                    |");
        System.out.println("+------------------------------------------------------------------+");
    }//end of showMainMenu method 
   
}//end of class
