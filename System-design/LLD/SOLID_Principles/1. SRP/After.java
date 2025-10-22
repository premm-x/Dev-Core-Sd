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
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice total: " + invoice.getTotal());
    }
}

public class After {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000, 0.18);
        new InvoicePrinter().print(invoice);
    }
}
