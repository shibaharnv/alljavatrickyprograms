import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class CollectionsJava {


    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> bl = new ArrayList<String>();

        //Queue<String> abc= new PriorityQueue<>();




        al.add("abc");
        al.add("def");
        al.add("ghi");
        al.add("jkl");

        System.out.println(al);

        bl = (ArrayList)al.clone();

        System.out.println("bl "+bl);


        System.out.println(al.contains("abc"));

        al.remove("def");

        System.out.println(al);
        al.removeAll(al);

        System.out.println(al);






        al.clone();
    }

}