package Arrays;

public class SumandAvgofAryelmnts {
    public static void main(String args[]){
        int[] numbers = {98,67,56,89,58,98,-45,97,-87};
        int sum =0;
        double average;
        for(int number: numbers){
            sum += number;
        }
        int arraylength = numbers.length;
        average = ((double)sum / (double)arraylength);

        System.out.println("sum = " + " " + sum);
        System.out.println("average = "+ " " + average);
    }
    
}

