public class Seperator
{
    public static void main(String[] args) {
        //ARRAY INITIALIZING
        int[] arr = UserInput.getIntArray();
        //2 ARRAYS MADE-WHICH STORE EVEN AND ODD INDICES

        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
   //MAKING OUR ARRAY
    int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenArr[evenIndex++] = arr[i];
            }
            else
            {
                oddArr[oddIndex++] = arr[i];
            }
            //USED TO STORE ARRAY ELEMENTS IN THEIR SPECIFIC INDICES
}
            System.out.print("Even numbers: ");
            for (int i = 0; i < evenIndex; i++)
            {
                System.out.print(evenArr[i] + ", ");
            }
            System.out.println();
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddArr[i] + ", ");

            }
    }
        }
