package solid_principles.s;


public class Invoice {
    private Marker marker;
    private int quantity;


    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }


    public int calculateTotal() { // 1st reason to change
        int price = ((marker.price) * this.quantity);
        return price;
    }


    public void printInvoice() { // 2nd reason to change
        //
    }


    public void saveToDB() { // 3rd reason to change
        //
    }
}
