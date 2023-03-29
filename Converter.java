import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    public static void main(String[] args) {
        //TAKE THE USER INPUT AND STORE IT IN ARRAY
        int[] arr = UserInput.getIntArray();
        //CONVERT ARRAY TO ARRAY LIST
        List<Integer> list = new ArrayList<>();
        //INITIALIZING OUR ARRAY LIST
        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }
        System.out.println("Array form is" + Arrays.toString(arr));
        //CONVERTING ARRAY LIST TO ARRAY
        System.out.println("Array List is " + list);
        int[] newArr = new int[list.size()]; for (int i = 0; i < list.size(); i++)
        {
            newArr[i] = list.get(i);
        }
        System.out.println("New array: " + Arrays.toString(newArr));
    }
}