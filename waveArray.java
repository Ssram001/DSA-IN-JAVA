package Array;

import java.util.Scanner;

public class waveArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<n;j+=2) {
            if (j==n-1){
                break;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        for(int k=0;k<n;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
