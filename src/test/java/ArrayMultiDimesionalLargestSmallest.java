public class ArrayMultiDimesionalLargestSmallest {


    public static void main(String args[])
    {


        long startTime = System.nanoTime();
        int a[][] = new int[2][3];

        a[0][0]= 10;
        a[0][1]= 1;
        a[0][2]= 3;

        a[1][0]= 5;
        a[1][1]= 8;
        a[1][2]= 13;

        //Smallest number in the array matrix

        int minvalue =a[0][0];

        int mincolumn=0;

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]<minvalue)
                {
                    minvalue=a[i][j];
                    mincolumn=j;

                }
            }
        }

           /*
         10 1 3
         5 8 13
         */

/*                    a[0][mincolumn];
                    a[1][mincolumn];*/

                    int k=0;

                    int maxvalue=a[0][mincolumn];

                    while (k<2)
                    {
                        if(a[k][mincolumn]>maxvalue)
                        {
                            maxvalue=a[k][mincolumn]  ;
                        }
                        k++;
                    }

                   System.out.println("Minimun value" +minvalue);
                    System.out.println("Max value in minium colum " +maxvalue);


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time " +totalTime);

    }
}