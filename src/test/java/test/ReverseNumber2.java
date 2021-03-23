package test;

public class ReverseNumber2 {

    public static void main(String args[]) {

            int num = 123;

            int reverse=0;

          while(num!=0)
          {
              //123-->% 3 --->Reverse =3
              //123 --> divi-->12
              //12 %-->2 -- Reverse =2
              //1/10

              reverse = reverse *10;

              reverse= reverse +num %10;

              num=num/10;

          }

        System.out.println("Reverse "+reverse);
    }
}