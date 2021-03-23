package test;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberinArray {

    public static void main(String[] args)
    {
        int[] a ={1,2,2,3,3};
        List<Integer> lobj = new ArrayList<Integer>();
        int count=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    lobj.add(a[i]);
                    count++;
                }
            }
        }

        System.out.println("Duplicate value " +lobj.toString());


        System.out.println("Duplicate value count  " +count);
    }
}