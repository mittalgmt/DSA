public class kadanesalg {
    
    public int kadanesalgmaxsum(int[] array) {
        int max_sum = array[0];
        int current_sum = array[0];
        
        for (int i = 1; i < array.length; i++) {
            current_sum = Math.max(array[i], current_sum + array[i]);
            max_sum = Math.max(max_sum, current_sum);
            
            System.out.println("Iteration " + i + ":");
            System.out.println("Current element: " + array[i]);
            System.out.println("Current sum: " + current_sum);
            System.out.println("Max sum so far: " + max_sum);
            System.out.println();
        }
        
        return max_sum;
    }

    public static void main(String[] args) {
        kadanesalg k = new kadanesalg();
        int[] array = {1, -2, 3, 4, -1, 2, 1, -5, 4}; // Sample input array
        System.out.println("Maximum Subarray Sum: " + k.kadanesalgmaxsum(array));
    }
}
