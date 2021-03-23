public class maxdifferencebetweenAnyAdjacentArray {


    public static void main(String args[]) {


        int[] a ={1,4,6,7,20};

        int diff=a[0];


        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]-a[i] >diff)
            {
                diff =a[i+1]-a[i];
            }
        }


        System.out.println("diff" +diff);
    }
}