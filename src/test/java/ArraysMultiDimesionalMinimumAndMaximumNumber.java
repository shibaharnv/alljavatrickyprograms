public class ArraysMultiDimesionalMinimumAndMaximumNumber {

    public static void main(String args[])
    {

        int a[][] = new int[2][3];


        a[0][0] =8;
        a[0][1] =1;
        a[0][2] =2;
        a[1][0] =0;
        a[1][1] =5;
        a[1][2] =3;


   /*     8 1 2

          4 5 3*/

        //System.out.println(a[1].length);

        int min =a[0][0];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]<min)
                {
                    min = a[i][j];
                }
            }
        }

        System.out.println("Smallest number is " +min);

        int max=a[0][0];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Largest number is " +max);
    }
}