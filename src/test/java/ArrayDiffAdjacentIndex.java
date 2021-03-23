public class ArrayDiffAdjacentIndex {

    public static void main(String args[])
    {
            int[] a ={1,5,25,50};



            int diff=0;

            for(int i=0; i<a.length-1;i++)
            {



                 if(a[i+1] -a[i]>diff)
                 {
                    diff=a[i+1]-a[i];
                 }

            }

            System.out.println("Diff "+diff);
    }
}