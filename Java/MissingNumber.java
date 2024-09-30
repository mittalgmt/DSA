public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4}; // n = 5, missing number is 3
        int n = 4;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number: " + missingNumber);
    }
}
