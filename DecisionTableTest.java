import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionTableTest {

    @Test
    public void testCalculateTicketCost1() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(-1, 0)).getMessage()); // R1
    }

    @Test
    public void testCalculateTicketCost2() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(-1, 3)).getMessage()); // R2
    }

    @Test
    public void testCalculateTicketCost3() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(-1, 5)).getMessage()); // R3
    }

    @Test
    public void testCalculateTicketCost4() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(1, 0)).getMessage()); // R4
    }

    @Test
    public void testCalculateTicketCost5() {
        assertEquals(6000, TicketCalculator.calculateTicketCost(1, 3)); // R5
    }

    @Test
    public void testCalculateTicketCost6() {
        assertEquals(11000, TicketCalculator.calculateTicketCost(1, 5)); // R6
    }

    @Test
    public void testCalculateTicketCost7() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(9, 0)).getMessage()); // R7
    }

    @Test
    public void testCalculateTicketCost8() {
        assertEquals(15000, TicketCalculator.calculateTicketCost(9, 3)); // R8
    }

    @Test
    public void testCalculateTicketCost9() {
        assertEquals(27000, TicketCalculator.calculateTicketCost(9, 5)); // R9
    }

    @Test
    public void testCalculateTicketCost10() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(12, 0)).getMessage()); // R10
    }

    @Test
    public void testCalculateTicketCost11() {
        assertEquals(30000, TicketCalculator.calculateTicketCost(12, 3)); // R11
    }

    @Test
    public void testCalculateTicketCost12() {
        assertEquals(54000, TicketCalculator.calculateTicketCost(12, 5)); // R12
    }

    @Test
    public void testCalculateTicketCost13() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(18, 0)).getMessage()); // R13
    }

    @Test
    public void testCalculateTicketCost14() {
        assertEquals(45000, TicketCalculator.calculateTicketCost(18, 3)); // R14
    }

    @Test
    public void testCalculateTicketCost15() {
        assertEquals(80000, TicketCalculator.calculateTicketCost(18, 5)); // R15
    }
}