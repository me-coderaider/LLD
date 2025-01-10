package solid_principles.s;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() { // only 1 reason to change
        // Save into the DB
    }
}
