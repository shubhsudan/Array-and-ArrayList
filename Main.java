public class Main {
    //FINDS THE NEAREST NEIGHBORING ARRAY ELEMENT
    public static int findNearestNeighbors(int[] arr)
    {
        int minDistance = Math.abs(arr[1] - arr[0]); int minIndex = 0;
        for (int i = 2; i < arr.length; i++) {
            int distance = Math.abs(arr[i] - arr[i - 1]); if (distance < minDistance) {
                minDistance = distance;
                minIndex = i - 1; }
        }
        return minIndex;
    }
    public static void main(String[] args)
    {
        int[] arr = UserInput.getIntArray();
        int nearestIndex = findNearestNeighbors(arr); if (nearestIndex == -1)
        {
            System.out.println("The input array is null or has fewer than two elements.");
        }
        else
        {
            System.out.println("The two nearest neighbors are " + arr[nearestIndex] + " and " + arr[nearestIndex + 1] + ".");
            System.out.println("The index of the first number is " + nearestIndex + ".");
        }
    }
}
