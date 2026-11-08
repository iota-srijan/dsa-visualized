package in.iota;

import java.util.Arrays;

public class MergeSortClassic {

    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a,aux,0,a.length-1);

    }

    public static void sort(int[] a,int[] aux, int lo, int hi) {
        if (lo>=hi) return;
        int mid = lo + (hi - lo)/2;

        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    public static void merge(int[] a,int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi ; k++) {
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi ; k++) {

            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];

            else if (aux[j]<aux[i])  a[k] = aux[j++];
            else a[k] = aux[i++];
 }

    }
    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
