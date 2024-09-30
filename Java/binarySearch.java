public class binarySearch {

    public void binarySearch(int[] array, int nosearch) {
        int left = 0;
        int right = array.length - 1;
        boolean found = false;  

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (array[mid] == nosearch) {
                System.out.println("Number found at index: " + mid + ", Number: " + array[mid]);
                found = true;
                break;  
            } else if (array[mid] < nosearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }

    public static void main(String[] args) {
        binarySearch bSearch = new binarySearch();
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10};
        int nsearch = 8;
        bSearch.binarySearch(intArray, nsearch);
    }
}
