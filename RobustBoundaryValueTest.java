import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RobustBoundaryValueTest {
    @Test
    public void testCalculateTicketCost1() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(9, 0)).getMessage());
    }

    @Test
    public void testCalculateTicketCost2() {
        assertEquals(5000, TicketCalculator.calculateTicketCost(9, 1));
    }

    @Test
    public void testCalculateTicketCost3() {
        assertEquals(10000, TicketCalculator.calculateTicketCost(9, 2));
    }

    @Test
    public void testCalculateTicketCost4() {
        assertEquals(27000, TicketCalculator.calculateTicketCost(9, 5));
    }
    @Test
    public void testCalculateTicketCost5() {
        assertEquals(41000, TicketCalculator.calculateTicketCost(9, 7));
    }
    @Test
    public void testCalculateTicketCost6() {
        assertEquals(48000, TicketCalculator.calculateTicketCost(9, 8));
    }
    @Test
    public void testCalculateTicketCost7() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(9, 9)).getMessage());
    }

    @Test
    public void testCalculateTicketCost8() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(-1, 5)).getMessage());
    }

    @Test
    public void testCalculateTicketCost9() {
        assertEquals(11000, TicketCalculator.calculateTicketCost(0, 5));
    }

    @Test
    public void testCalculateTicketCost10() {
        assertEquals(11000, TicketCalculator.calculateTicketCost(1, 5));
    }
    @Test
    public void testCalculateTicketCost11() {
        assertEquals(80000, TicketCalculator.calculateTicketCost(17, 5));
    }
    @Test
    public void testCalculateTicketCost12() {
        assertEquals(80000, TicketCalculator.calculateTicketCost(18, 5));
    }

    @Test
    public void testCalculateTicketCost13() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(19, 5)).getMessage());
    }
}