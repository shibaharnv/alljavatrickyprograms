public class PrimeNumberPractice {

    public static void main(String[] args)
    {
        int n=4;
        int remainder;
        boolean flag =false;

        for(int i=2;i<n;i++)
        {
            remainder= n%i;

            if(remainder==0)
            {
                flag=true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Given number is not a prime number");
        }
        else
        {
            System.out.println("Given number is  a prime number");
        }


    }
}