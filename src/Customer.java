public class Customer extends Person {
    protected String address;
    protected int creditCardNumber;
    protected CustomerController customerController;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
class CustomerController{
    Cart cart;
}