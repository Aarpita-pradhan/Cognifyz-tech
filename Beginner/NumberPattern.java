import java.util.*;
public class NumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number pattern to generate:");
        System.out.println("OPTION 1. Pyramid");
        System.out.println("OPTION 2. InvertedPyramid");
        System.out.println("OPTION 3. Triangle");
        System.out.println("OPTION 4. InvertedTriangle");
        System.out.println("OPTION 5. Diamond");
        System.out.print("Enter an option in between(1-4): ");
        int option= sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        switch (option) {
            case 1:
                Pyramid(rows);
                break;
            case 2:
                invertedPyramid(rows);
                break;
            case 3:
                Triangle(rows);
                break;
            case 4:
                InvertedTriangle(rows);
                 break;
            case 5:
               Diamond(rows);
                break;
            default:
                System.out.println("Invalid option! Please select option in between 1 to 5.");
        }
    }

    // pyramid pattern
    private static void Pyramid(int rows) {
        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    //inverted pyramid pattern
    private static void invertedPyramid(int rows) {
        System.out.println("Inverted Pyramid Pattern:");
        for(int i= rows;i >= 1;i--){
            for(int j= rows;j > i; j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }

    // triangle pattern
    private static void Triangle(int rows) {
        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    //inverted triangle pattern
    private static void InvertedTriangle(int rows) {
        System.out.println("InvertedTriangle Pattern:");
        for (int i = rows; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // diamond pattern
    private static void Diamond(int rows) {
        System.out.println("Diamond Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(k);
            }
            System.out.println();

        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

