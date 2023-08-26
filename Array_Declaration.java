
package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Declaration {
    int[] array2;

    public static void main(String[] args) {

        // one type of array initiation
        int[] array = new int[5];
        // int[] --> Type of dat stored in array is integer
        // array ==> name of the array
        // new ==> object initiation
        // int[5] ==> declaring the total elements inside the array should be

        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        System.out.println(Arrays.toString(array));

        // another type of array initiation
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));

        int[] array2 = {10,20,30,40,50};
        System.out.println(Arrays.toString(array2));

        // another way of array initialization with integer range
        int[] array3 = IntStream.range(1,15).toArray();
        System.out.println(Arrays.toString(array3));

        //another way with range closed
        int[] array4 = IntStream.rangeClosed(1,10).toArray();
        System.out.println(Arrays.toString(array4));

        //another way to declaration
        int[] array5 = IntStream.of(1,3,5,7,9,11).toArray();
        System.out.println(Arrays.toString(array5));

    }
}