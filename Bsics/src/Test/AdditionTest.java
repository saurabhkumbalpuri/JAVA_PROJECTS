package Test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

 

class AdditionTest {

 


    @Test
    @Tag("IntegrationTest")
    @DisplayName("Add")
    void testAddsdf() {
        Addition obj = new Addition();
        System.out.println("from Add method");
        int result = obj.add(2, 3);
        assertEquals(5, result);
    }

 

    @Test
    @Tag("UnitTest")
    void testDummy() {
        System.out.println("from dummy");
        assertTrue(true);
    }

 

    @BeforeAll
    static void setup() {
        System.out.println("from before All");
    }

 

    @BeforeEach
    void init() {
        System.out.println("from before each");
    }

 

    @AfterAll
    static void afterAllMethod() {
        System.out.println("after All method");
    }

 

    @AfterEach
    void afterMethod() {
        System.out.println("after each method");

 

    }

 

    @Test
    @Tag("IntegrationTest")
    void assertThrowsException() {
        String str = null;
//        System.out.println(Integer.valueOf(str));
        assertThrows(RuntimeException.class,()  -> {
            Integer.valueOf(str);
        });

 

    }

 


    @Test
    @Tag("UnitTest")
    void testSingleSuccessTest() {
        System.out.println("Success");
    }

 


}
 