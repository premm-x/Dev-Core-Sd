class Invoice {
    private double amount;
    private double taxRate;

    public Invoice(double amount, double taxRate) {
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public double getTotal() {
        return amount + (amount * taxRate);
    }

    public void printInvoice() {
        System.out.println("Invoice total: " + getTotal());
    }
}

public class Before {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000, 0.18);
        invoice.printInvoice();
    }
}
