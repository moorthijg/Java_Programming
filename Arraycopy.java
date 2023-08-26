package Arrays;
import java.util.Arrays;

class Arraycopy {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 12, 4, 12, -2};
      
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println(Arrays.toString(n2));

        System.arraycopy(n2,2,n3,1,2);
        System.out.println(Arrays.toString(n3));
    }}

/*System.arraycopy(n1, 0, n2, 0, n1.length) - entire elements from the n1 array are copied to n2 array
System.arraycopy(n1, 2, n3, 1, 2) - 2 elements of the n1 array starting from index 2 
are copied to the index starting from 1 of the n3 array */