package de.tejotes.ts1;

public class Test1 {

    public static void main(final String[] args) {
        Test1 t = new Test1();
        for (String string : args) {
            String hello = t.sayHello(string);
            System.out.println(hello);
        }
    }

    public String sayHello(final String who) {
        return "Hello " + who + "!";
    }

    public String sayBye(final String who) {
        return "Good bye " + who + "!";
    }
}
