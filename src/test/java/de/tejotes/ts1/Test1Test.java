package de.tejotes.ts1;

import org.junit.Test;

public class Test1Test extends junit.framework.TestCase {

    @Test
    public void testSayHello() throws Exception {
        Test1 t = new Test1();
        String hello = t.sayHello("Thomas");
        System.out.println(hello);
    }

}
