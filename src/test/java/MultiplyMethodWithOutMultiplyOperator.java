public class MultiplyMethodWithOutMultiplyOperator {


    public static void main(String args[]) {

          int finalsum =multiplyMethod(10,10);

          System.out.println("Final Sum " +finalsum);

    }

    private static int multiplyMethod(int a, int b) {


        int totalsum = 0;

        int i=0;

        while (i<b)
        {
            totalsum =totalsum +a;
            i++;
        }


        return totalsum;
    }
}