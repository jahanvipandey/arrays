import java.util.*;

public class Juggling {

    void rotateArray(int arr[], int d, int n) {

        int k = -1, i, j, temp;

        for(i = 0; i < gcd(d, n); i++) {
            j = i;
            temp = arr[i];
            
            while(true) {
                k = (j + d) % n;

                if(k == i)
                    break;

                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    int gcd(int a, int b) {
        //gcd(a,b) = gcd(b, a%b);
        if(b == 0)
            return a;
        //else
        return gcd(b, a%b);
    } 

    void printArray(int arr[], int n) {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
