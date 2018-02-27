import java.util.Arrays;
import java.util.Scanner;

public class TCS {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = {1,23,44,100,4234,4324,234,32,4,456,5,65,7658,67,243,78,678,6,234,534,6346};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        int foundAt=Arrays.binarySearch(array, 6);
        System.out.println("Value found at index= "+foundAt);
    }
}
