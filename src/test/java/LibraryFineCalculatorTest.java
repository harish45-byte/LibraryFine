import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LibraryFineCalculatorTest {

    @Test
    void testFineWithin5Days() {
        assertEquals(6, LibraryFineCalculator.calculateFine(3));
    }

    @Test
    void testFineWithin10Days() {
        assertEquals(20, LibraryFineCalculator.calculateFine(7));
    }

    @Test
    void testFineAbove10Days() {
        assertEquals(55, LibraryFineCalculator.calculateFine(12));
    }
}