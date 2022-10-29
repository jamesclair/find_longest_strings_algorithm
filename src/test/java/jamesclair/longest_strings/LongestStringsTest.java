package jamesclair.longest_strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringsTest {
    String[] mixedSizeStrings = new String[] {"longxxxx",
            "short",
            "medium",
            "longxxxx",
            "medium"
    };

    @BeforeEach
    void setUp() {

    }

    @Test
    void getLongestStrings() {
        String[] expectedLongStrings = new String[] {"longxxxx",
                "longxxxx"
        };
        String[] longStrings = new LongestStrings(mixedSizeStrings).getLongestStrings();
        assertArrayEquals(longStrings, expectedLongStrings, "expectedLongString was NOT matched!");
    }
}