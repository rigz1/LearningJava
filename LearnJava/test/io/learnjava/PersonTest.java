package io.learnjava;


//import org.junit.Test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld (){
        Person Alexx = new Person();
        assertEquals("Hello World",Alexx.helloWorld());

    }
}
