public class TicketCalculator {
    public static int calculateTicketCost(int age, int hours) {
        if (age < 0 || age > 18) {
            throw new IllegalArgumentException("Độ tuổi không hợp lệ.");
        }
        if (hours < 1 || hours > 8) {
            throw new IllegalArgumentException("Số giờ không hợp lệ.");
        }
        int costPerHour;
        if (age >= 0 && age <= 5) {
            costPerHour = (hours <= 4) ? hours * 2000 : 4 * 2000 + (hours - 4) * 3000;
        } else if (age >= 6 && age <= 10) {
            costPerHour = (hours <= 4) ? hours * 5000 : 4 * 5000 + (hours - 4) * 7000;
        } else if (age >= 11 && age <= 15) {
            costPerHour = (hours <= 4) ? hours * 10000 : 4 * 10000 + (hours - 4) * 15000;
        } else {
            costPerHour = (hours <= 4) ? hours * 15000 : 4 * 15000 + (hours - 4) * 20000;
        }
        return costPerHour;
    }

    public static void main(String[] args) {
        int age = 8, hours = 6;
        try {
            int totalCost = calculateTicketCost(age, hours);
            System.out.println("Tổng chi phí vé là: " + totalCost + " VND");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}