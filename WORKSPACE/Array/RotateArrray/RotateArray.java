public class RotateArray {
    
    void leftRotate(int arr[], int d, int n){
        for(int i = 0; i < d; i++){
            int temp, j;
            temp = arr[0];
            for(j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1]; 
            arr[n - 1] = temp;
        }
    }

    void printArray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
