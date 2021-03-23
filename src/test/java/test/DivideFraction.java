package test;

public class DivideFraction {

    static int[] ans;

    public static void main(String[] args) {

        DivideFraction obj = new DivideFraction();
        obj.myFunction(1500,25000);
    }


        public void myFunction(int num1,int den1)
        {

            inverse(num1,den1);
            int gcd = calculateGCD(ans[0],ans[1]);

            System.out.println("gcd "+gcd);

            int finalnumerator= ans[0]/gcd;
            int finaldenominator= ans[1]/gcd;
            System.out.println("finalnumerator "+finalnumerator);
            System.out.println("finaldenominator "+finaldenominator);

            if(finaldenominator==1)
            {
                System.out.println("Output "+finalnumerator);
            }

            else {

                String finalnumeratorstring = String.valueOf(finalnumerator);
                String finaldenominatorstring = String.valueOf(finaldenominator);
                String fractionString = finalnumeratorstring + "/" + finaldenominatorstring;

                System.out.println("Output " + fractionString);
            }

        }

    /**
     * Calculates gcd of two numbers
     *
     * @param num1
     * @param den1
     * @return
     */
    public static int calculateGCD(int num1, int den1) {
        if (num1 % den1 == 0) {
            return den1;
        }
        return calculateGCD(den1, num1 % den1);
    }

//Inverse the given number function
    public static int[] inverse(int num1, int den1){

         ans = new int[2];
        int temp = num1;
        num1 = den1;
        den1 = temp;

        ans[0] = num1;
        ans[1] = den1;

        System.out.println(ans[0]);
        System.out.println(ans[1]);

        return ans;
    }
}