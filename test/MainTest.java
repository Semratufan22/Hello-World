// MainTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void humanReadableSizeTest() {
        assertEquals("Small", MagicNumberGame.humanReadableSize((byte) 0));
        assertEquals("Medium", MagicNumberGame.humanReadableSize((byte) 1));
        assertEquals("Large", MagicNumberGame.humanReadableSize((byte) 2));

        // Out of bounds issues
        assertEquals("Small", MagicNumberGame.humanReadableSize((byte) -3));
        assertEquals("Large", MagicNumberGame.humanReadableSize((byte) 4));
    }
    @Test
    void humanReadableBoolean(){
        assertEquals( "Yes", MagicNumberGame.humanReadableBoolean(true));
        assertEquals( "No", MagicNumberGame.humanReadableBoolean(false));

        }

    }
