import java.util.HashSet;
import java.util.Iterator;

public class CollectionsJavaHashSet {


    public static void main(String[] args) {


        HashSet<String> hs= new HashSet<String>();

        hs.add("hi");
        hs.add("hello");
        hs.add("bye");
        hs.add("bye");
        hs.add("123");
        hs.add("THIS");
        hs.add("to");

           Iterator<String> it = hs.iterator();

           while(it.hasNext())
           {
               System.out.println(it.next());
           }


    }

}