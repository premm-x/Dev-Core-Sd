class DiscountCalculator {
    public double getDiscount(String type, double amount) {
        if (type.equals("NEWYEAR")) {
            return amount * 0.2;
        } else if (type.equals("SUMMER")) {
            return amount * 0.3;
        } else {
            return 0;
        }
    }
}

public class Before {
    public static void main(String[] args) {
        DiscountCalculator dc = new DiscountCalculator();
        System.out.println(dc.getDiscount("SUMMER", 1000));
    }
}
