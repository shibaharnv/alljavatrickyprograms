package test;

import java.util.Arrays;

public class GreaterNumberinArrayMethodcall {

    public static void main(String[] args)
    {

        GreaterNumberinArrayMethodcall obj = new GreaterNumberinArrayMethodcall();

        int[] a ={11,3,222};

       int[] b= obj.getGreatestNumber(a);

       System.out.println("Descending array " + Arrays.toString(b));

        System.out.println("Greatest number in array  " +b[0]);

    }


    public int[] getGreatestNumber(int[] aarray)
    {

        int temp ;

        for(int i =0; i<aarray.length;i++)
        {

            for(int j=i+1; j<aarray.length;j++)
            {
                if(aarray[i]<aarray[j])

                {
                    temp =aarray[i];
                    aarray[i] =aarray[j];
                    aarray[j] =temp;
                }
            }

        }

        return aarray;

    }
}