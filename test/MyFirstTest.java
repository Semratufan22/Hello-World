import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    void helloFromTest() {
        //Arrange
        String myValue = "Hello World";

        //Act
        String result = myValue + "!";

        //Assert
        assertEquals("Hello World!", result);
    }
    @Test
    void declareTypedValues(){
        String notWool = "Strings in java are not made of wool";
        int largestNumberForInt = 2147483647;

        assertEquals(2147483647, largestNumberForInt);
        double avogadro = 6.02214076E23;
        assertEquals(avogadro, 6.02214076E23);
        double valueFromInt = largestNumberForInt;
        assertEquals(2147483647, valueFromInt);

        int avogadroAsInt = (int) avogadro;
        assertEquals(2147483647, avogadroAsInt);

        int a = 1;
        int b = 41;
        int answer = a + b;
        assertEquals (42,answer);



    }



}