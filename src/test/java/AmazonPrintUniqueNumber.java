import java.util.ArrayList;

public class AmazonPrintUniqueNumber {


    public static void main(String args[])
    {

        int a[] = {1,1,2,2,5};

        //Print Unique Number:

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        //if a[0]=a[1] increase count ++

        for(int i=0;i<a.length;i++)
        {

            int count =0;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count ++;
                }
            }
        }


    }
}