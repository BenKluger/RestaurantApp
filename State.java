public interface State {
    public void makeReservation(Patron patron);
    public void talkToHost(Patron patron);
    public void placeOrder(Patron patron, double price);
    public void askForBill(Patron patron);
    public void payBill(Patron patron, double payment);
    public void leave(Patron patron);
}
