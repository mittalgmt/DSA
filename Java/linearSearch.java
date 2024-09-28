public class linearSearch {

    // Method to perform linear search
    public void linearSearch(int[] array, int nosearch) {
        int n = array.length;
        boolean found = false; // Flag to check if the number is found

        for (int i = 0; i < n; i++) {
            if (array[i] == nosearch) {
                System.out.println("Number found at index: " + i + ", Number: " + array[i]);
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nsearch = 8;

        linearSearch linsearch = new linearSearch();
        linsearch.linearSearch(intArray, nsearch);
    }
}
