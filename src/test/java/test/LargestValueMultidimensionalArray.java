package test;

public class LargestValueMultidimensionalArray {

    public static void main(String[] args)
    {
       // int a[][] =new int[2][3];

        int a[][]  ={{1,2,3},{6,17,9}};

      //  int c[][]= {{2,4,5},{3,0,7},{1,2,9}};

        // assuming a[0][0] is the largest value


        int max = a[0][0];
        for(int i=0;i< 2;i++)
        {
            for(int j=0; j<3;j++)
            {
                if(a[i][j]> max)
                {
                    max = a[i][j];
                }
            }


        }

        System.out.println("max value " +max);
    }
}