import java.util.Arrays;
import java.util.List;

public class SortingArray {


    public static void main(String args[]) {

        int a[] ={1,2,6,4,3,7};


        int temp;

        // first compare 1 and 2 and swap if the second value is small


        System.out.println("a.length" +a.length);

        for(int i=0; i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {

                if(a[i]>a[j])
                {

                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;



                }

            }



        }

        System.out.println("Array final" + Arrays.stream(a).toArray());

        System.out.println("Array final" + Arrays.toString(a));

    }
}