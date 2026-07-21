package Array;

import java.util.Arrays;

public class Merge2ShortedArray {
    static void main(String[] args) {
// Using 3 pointer tecniques
        int [] a = {2, 5 ,6, 9, 20};
        int [] b = {1, 3, 4, 5, 7, 8};

        int [] c = new int[a.length + b.length];
        for( int ele : c) System.out.print(ele+" ");
        System.out.println();
        merge(c,a,b);
        for( int ele : c) System.out.print(ele+" ");
        System.out.println();


    }
    private static void merge(int [] a, int [] b, int [] c) {
        int i=0, j =0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
             else{
                    c[k]=b[j];
                    j++;
                    k++;

            }
        }
    }
}
