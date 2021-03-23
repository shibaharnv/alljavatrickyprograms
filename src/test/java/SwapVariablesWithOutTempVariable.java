public class SwapVariablesWithOutTempVariable {


    public static void main(String args[]) {

        int a =6;
        int b =7;

        a=a+b; //a=13
        b=a-b; //b=6
        a=a-b; // a=7

        System.out.println("Swapped a value " +a);
        System.out.println("Swapped b value " +b);


        int c =8;

        int d =12;

        c =c+d;
        d= c-d;
        c= c-d;
        System.out.println("Swapped c value " +c);
        System.out.println("Swapped d value " +d);


    }

}