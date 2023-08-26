package Arrays;

import java.util.Arrays;


public class Arraycopyrange {

    public static void main(String args[]){
    int[] A= {2,4,6,8,9};
    int[] B = Arrays.copyOfRange(A, 2, A.length);
    System.out.println(Arrays.toString(B));
    
}
}