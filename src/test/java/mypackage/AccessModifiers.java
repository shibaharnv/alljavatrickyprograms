package mypackage;
import test.AccessModifierTest;

public class AccessModifiers extends AccessModifierTest {

    int a;

    public static void main(String args[])
    {

       // AccessModifierTest amtobj= new AccessModifierTest();
        AccessModifiers amobj = new AccessModifiers();

        System.out.println(amobj.i);

    }


}