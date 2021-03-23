import java.util.Arrays;

public class SortingAscendingDescending {

    public static void main(String args[])
    {
        int[] a ={1,5,3,4,7};

        int temp =0;

/*
        Sorting technique:


        For loop iteration
        1 compare 4

*/
        //Ascending Order

        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {

                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }

        System.out.println("Array Ascending" + Arrays.toString(a));


        //Descending order

        int[] b ={7,34,8,4,89};


        for(int i=0;i<b.length;i++)
        {

            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]<b[j])
                {

                    temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;

                }
            }

        }

        System.out.println("Array Descending" + Arrays.toString(b));






    }
}