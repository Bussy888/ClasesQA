package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @BeforeEach
    public void before(){
        System.out.println("Before");
        //Antes de cada test
        //requirement -> setup / initialize
    }
    @Test
    public void verifySomething(){
        System.out.println("Test 1");
        //step
        //step
        //verification
    }
    @Test
    public void verifySomething2(){
        System.out.println("Test 2");
        //step
        //step
        //verification
    }
    @AfterEach
    public void after(){
        System.out.println("After");
        //cleanup / teardown
    }

}
