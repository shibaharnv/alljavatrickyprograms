package test;

import java.util.ArrayList;

public class findGreatestIntegerInList {

    public static void main(String[] args )
    {
     /*   ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(5);
        aobj.add(15);
        aobj.add(25);
        aobj.add(18);

        for(int i=0;i<=aobj.size();i++)
        {
            if(aobj.get(i)<aobj.get(i+1))
            {
               int  temp =aobj.get(i+1);
            }
        }*/

        int[] a ={1,2,3};

        int temp;

        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp =a[i];

                }
            }

        }
    }
}