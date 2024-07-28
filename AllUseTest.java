import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AllUseTest {
    @Test
    public void testCalculateTicketCost1() {
        assertEquals("Độ tuổi không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(19, 2)).getMessage());
    }

    @Test
    public void testCalculateTicketCost2() {
        assertEquals("Số giờ không hợp lệ.", assertThrows(IllegalArgumentException.class,
                () -> TicketCalculator.calculateTicketCost(10, 0)).getMessage());
    }

    @Test
    public void testCalculateTicketCost3() {
        assertEquals(4000, TicketCalculator.calculateTicketCost(4, 2));
    }

    @Test
    public void testCalculateTicketCost4() {
        assertEquals(11000, TicketCalculator.calculateTicketCost(4, 5));
    }

    @Test
    public void testCalculateTicketCost5() {
        assertEquals(10000, TicketCalculator.calculateTicketCost(8, 2));
    }

    @Test
    public void testCalculateTicketCost6() {
        assertEquals(27000, TicketCalculator.calculateTicketCost(8, 5));
    }

    @Test
    public void testCalculateTicketCost7() {
        assertEquals(20000, TicketCalculator.calculateTicketCost(11, 2));
    }

    @Test
    public void testCalculateTicketCost8() {
        assertEquals(54000, TicketCalculator.calculateTicketCost(11, 5));
    }

    @Test
    public void testCalculateTicketCost9() {
        assertEquals(30000, TicketCalculator.calculateTicketCost(18, 2));
    }

    @Test
    public void testCalculateTicketCost10() {
        assertEquals(80000, TicketCalculator.calculateTicketCost(18, 5));
    }
}
