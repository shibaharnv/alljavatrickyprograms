package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestNumberinArrayUsingSort {

    public  static  void main(String[] args)
    {

        //Sorting means Ascending
        //Arrays is a class present in java util package
        int[] a = {11,51,17,3};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println("greatest number in an array " +a[a.length-1]);

        // Ascending


            //Descending Order

        //Collections descending order we cannot be done on primitive types

        Integer[] arr ={1,5,3,7,8};

            Arrays.sort(arr);
        System.out.println("Ascending " +Arrays.toString(arr));

         Arrays.sort(arr,Collections.reverseOrder());

        System.out.println("descending " +Arrays.toString(arr));
    }
}