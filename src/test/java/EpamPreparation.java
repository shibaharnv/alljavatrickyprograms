public class EpamPreparation {

    public static void main(String[] args)
    {
        String a= "hello";

        a.concat("world");

        String c=    a.concat(" world");

        System.out.println("print a "+a);

        System.out.println("print c "+" "+c);

        String s = new String("test");


        StringBuffer sb= new StringBuffer("hello");

        System.out.println("string buffer" +sb);

        sb.append("world");

        System.out.println("string buffer append " +sb);

        sb.replace(2,5,"shi"); //llo replaced by shi

        System.out.println("string buffer replace " +sb);

        sb.deleteCharAt(5);

        System.out.println("string buffer delete " +sb);

        sb.reverse();

        System.out.println("string buffer reverse " +sb);


        String d ="hello";

        String e = "hello";

        String s1 = new String("hello");

        String S2= new String("hello");

        System.out.println(d.equals(e));  // true

        //. equals matches the content
        // == matches the references
        System.out.println(d==e); // true

        System.out.println(d.equals(s1));//true

        System.out.println(d==s1);// false since the references are different

        System.out.println(s1.equals(S2)); //true

        System.out.println(s1==S2);// false since the references are different






    }


}