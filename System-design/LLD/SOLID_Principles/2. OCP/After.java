interface Discount {
    double calculate(double amount);
}

class NewYearDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}

class SummerDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.3;
    }
}

class DiscountService {
    public double getDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}

public class After {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        System.out.println(service.getDiscount(new SummerDiscount(), 1000));
    }
}
