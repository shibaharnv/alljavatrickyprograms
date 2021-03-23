public class ReverseNumber {

    public static void main(String args[]) {

            int num = 123;

            int reverse=0;

            while(num!=0)
            {
                int digit =num%10;


               reverse=     digit+ reverse *10;

                num =num/10;

                System.out.println(reverse);



            }

        System.out.println(reverse);


    }
}