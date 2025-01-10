package solid_principles.s;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void print() { // only 1 reason to change
        // print invoice
    }
}
