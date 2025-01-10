package solid_principles.o;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() { // only 1 reason to change
        // Save into the DB
    }

    // If we are saving the invoice in a database. Now, we want to save it in a file as well using the new method below.
    // Then as per, O - This class is open to extension and closed for modification.
    public void saveToFile(String filename){
        // Save invoice into a file with the given name
    }

}
