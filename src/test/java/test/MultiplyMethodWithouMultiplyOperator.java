package test;

public class MultiplyMethodWithouMultiplyOperator {

    public static void main(String[] args)
    {

       int output = multiplication(15 ,2);

        System.out.println("final output "+output);

        // 3 3

    }

    private static int multiplication(int x, int y) {

      int finalvalue =0;

      for(int i=0;i<y;i++) {
          finalvalue = finalvalue + x;
      }

      return finalvalue;

    }


}