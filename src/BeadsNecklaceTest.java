import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeadsNecklaceTest {

    BeadsNecklace beadsNecklace = new BeadsNecklace();

    @Test
    void isPrime() {
    }

    @Test
    void swap() {
    }

    @DisplayName("testing for 6 beads")
    @Test
    void calculateNumNecklacesfor6beads() {
        int expected = 2;
        int numBeads = 6;
        int[] beads =  beadsNecklace.constructBeads(numBeads);
        assert (beadsNecklace.calculateNumNecklaces(beads, numBeads, 1) == expected);
    }


    @DisplayName("testing for odd number of beads")
    @Test
    void calculateNumNecklacesforOddBeads() {
        int expected = 0;
        int numBeads = 5;
        int[] beads =  beadsNecklace.constructBeads(numBeads);
        assert (beadsNecklace.calculateNumNecklaces(beads, numBeads, 1) == expected);
    }
}