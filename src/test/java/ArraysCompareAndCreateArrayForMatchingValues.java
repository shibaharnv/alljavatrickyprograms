import java.util.ArrayList;

public class ArraysCompareAndCreateArrayForMatchingValues {


    //Compare same indexes of two different arrays and create an array for matching values
    public static void main(String args[])
    {

        int[] a ={1,2,5,7,8};
        int[] b ={1,4,6,7,8};

        ArrayList<Integer> arrobj = new ArrayList<Integer>();

       /* a[0] compare b[0]
        a[1] compare b[1]
        a[2] compare b[2]

        //first both the array lengths should be equal
        for loop iterate with one array length
        if a[i] =b[i] then add the element into a arraylist -->arrobj.add(a[i])
        finally print arrayobj
*/


        if(a.length==b.length)
        {
            System.out.println("Array Lengths are matching ");

            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b[i])
                {
                    arrobj.add(a[i]);
                }
            }

            System.out.println("Matching arrays " +arrobj);
            Object[] aobj = arrobj.toArray();

            System.out.println("Object arary "+aobj);

            for(Object c:aobj)
            {
                System.out.println("for each loop"+c);
            }
        }

        else
        {
            System.out.println("Array length Not matching");
        }


    }
}