import java.util.Scanner;

public class JugglingMain {
    
    public static void main(String[] args) {
        Juggling rotate = new Juggling();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        rotate.rotateArray(arr, 3, 9);
        rotate.printArray(arr, 9);
    }
}
