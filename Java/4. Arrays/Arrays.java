public class Arrays {
    public static void main(String[] args) {
        int[]   numbers1 = new int[3];                 // Array for 3 int values, default value is 0
        int[]   numbers2 = { 1, 2, 3, 4, 5, 6 };                // Array literal of 3 int values
        int[]   numbers3 = new int[] { 1, 2, 3 };      // Array of 3 int values initialized
        int[][] numbers4 = { { 7, 8, 9 }, { 10, 11, 12 } };  // Jagged array literal
        int[][] numbers5 = new int[5][];               // Jagged array, one dimension 5 long
        int[][] numbers6 = new int[5][4];              // Multidimensional array: 5x4
        // Arrays can be created using any primitive or reference type (objects)

        // -------------------------------------------------------------------------------
        // Iterating over arrays
        System.out.println("Simple Arrays Iteration:");
        for (int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]); //Read
            // numbers2[i] = i;              // Write
        }
        System.out.println("");

        // Iterating over multi-dimensional arrays
        System.out.println("Multidimensional Arrays Iteration:");
        for (int j=0; j<numbers4.length; j++){
            for (int k=0; k<numbers4[j].length; k++){
                System.out.println(numbers4[j][k]);
            }
        }
        System.out.println("");

        // Iterating in reverse order
        System.out.println("Iterating in reverse order:");
        for (int l=numbers2.length-1; l>=0; l--){
            System.out.println(numbers2[l]);
        }
        System.out.println("");
    }
}
