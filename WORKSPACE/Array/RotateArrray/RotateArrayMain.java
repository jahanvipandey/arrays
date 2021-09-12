import java.util.Scanner; //for input

public class RotateArrayMain {
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1,2,3,4,5};
        rotate.leftRotate(arr, 2, 5);
        rotate.printArray(arr, 5); 
    }
}
