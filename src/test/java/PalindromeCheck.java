public class PalindromeCheck {


    public static void main(String[] args) {

        String a = "madams";

        String reverse="";

        for(int i=a.length()-1;i>=0;i--)
        {
            char c =a.charAt(i);

            reverse = reverse + c;

            System.out.println(c);
        }


        System.out.println("reverse "+reverse);

        if(a.equalsIgnoreCase(reverse))
        {
            System.out.println("Given text "+ a+" is a palindrom string ");
        }

        else
        {
            System.out.println("Given text "+ a+" is NOt palindrom string ");
        }
    }

}