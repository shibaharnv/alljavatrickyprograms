import java.util.HashMap;

public class ArrayElementSumMethod {

//Create a method which accepts Array  and returns sum of all elements in array
    public static void main(String args[])
    {

        int[] a = {1,3,4,5,10};

        int totolsum =sumArrayMethod(a);

        System.out.println("Total Sum "+totolsum);

        //HashMap


    }

    private static int sumArrayMethod(int[] a) {
        int addsum = 0;

        for(int i=0;i<a.length;i++)
        {
          addsum=  addsum +a[i];

        }



        return addsum;
    }


}