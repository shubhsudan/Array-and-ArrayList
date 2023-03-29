import java.util.Scanner;
public class UserInput {
    public static int[] getIntArray() {
        //SCANNER CLASS TO READ INPUT BY USER ONE BY ONE
        Scanner scanner = new Scanner(System.in);
        //ASKING FOR THE SIZE OF ARRAY
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        //WHAT ARRAY_SIZE DOES THE USER WANT?
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            //ENTER ELEMENTS FOR THE ARRAY
        }
        return arr;
    }
}