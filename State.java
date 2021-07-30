public interface State {
    public void makeReservation(Patron patron);
    public void talkToHost(Patron patron);
    public void placeOrder(Patron patron);
    public void askForBill(Patron patron);
    public void payBill(Patron patron);
    public void leave(Patron patron);
}
