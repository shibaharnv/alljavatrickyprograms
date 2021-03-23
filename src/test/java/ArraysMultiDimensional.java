public class ArraysMultiDimensional {


    public static void main(String args[]) {

// Find the smallest number in the multi dimensional array

        int a[][] = new int[2][3];

        a[0][0]=8;
        a[0][1]=1;
        a[0][2]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=-5;


          int min =a[0][0];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Testing value " +a[i][j]);

                    if(a[i][j]<min)
                    {
                        min=a[i][j];
                    }
            }
        }


        System.out.println("minumum value " +min);



        // Find the largest number in the multi dimensional array



        int b[][]={{8,1,2},{3,24,15}};

    /*    8 1 2
          3 4 15 */



        int max=b[0][0];

        for(int i=0;i<2;i++)
        {

            for(int j=0;j<3;j++)

            {
                if(b[i][j]>max)
                {
                    max= b[i][j];
                }

            }
        }

        System.out.println("max value "+max);

    /*    System.out.println(b[0][2]);

        System.out.println("b lenght "+b.length);





        System.out.println(a[1][2]);*/




        // Find the smallest in the Array matrix in the same column find the highest number

/*


        2 4 5
        3 0 7
        1 2 9
*/


        int c[][]= {{2,4,5},{3,0,7},{1,2,9}};



        int minvalues= c[0][0];
        int mincolumn =0;


        for(int f=0;f<3;f++)
        {
            for(int g=0;g<3;g++)
            {
                if(minvalues<c[f][g])
                {
                    c[f][g]=minvalues;
                    mincolumn=g;
                }
            }
        }

        System.out.println("min column " +mincolumn);

                int z=0;

                int maxvaluesnew=c[0][mincolumn];

                while(z<3)
                {
                   if(  c[z][mincolumn]>maxvaluesnew)
                   {
                       maxvaluesnew =c[z][mincolumn];
                   }

                    z++;
                }


                System.out.println("Max value present in the mimiun value column is "+maxvaluesnew);




    }

}