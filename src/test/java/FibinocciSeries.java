public class FibinocciSeries {

    public static void main(String args[]) {

        //0 1 1 2 3 5 8

        int i=0;

        int a =0;
        int b=1;

        int sum =0;

 while(i<9)
 {
     sum=a+b;

     System.out.println(sum);
     a=b;
     b=sum;
  i++;
 }

    }
}