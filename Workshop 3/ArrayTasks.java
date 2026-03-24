public class ArrayTasks {
    public static void main(String[] args) {
        // Q1: Array of integers and reverse print 
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.print("Reversed Array: ");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Q2: Sum and Average of floating-point numbers 
        float[] floatArray = {12.5f, 25.0f, 15.5f, 10.0f};
        float sum = 0;
        for (float val : floatArray) {
            sum += val;
        }
        float average = sum / floatArray.length;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}