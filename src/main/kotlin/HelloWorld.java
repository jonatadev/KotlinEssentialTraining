import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.security.Permission;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java");

        Person bob = new Permission("Jonatas", "Alves");

        System.out.println("The new employee names is " + bob.getFirstName());

        bob.setFirstName("Alan Turing");
        System.out.println("His name is now = " + bob.getFirstName());

        Integer maxInt = MaxIntKt.max(2001,2010);
        System.out.println(maxInt);
    }
}
