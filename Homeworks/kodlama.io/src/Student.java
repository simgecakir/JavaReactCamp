public class Student extends User {

    private String billingAddress;
    private String paymentInfo;

    public Student(int id, String name, String email, String password) {
        super(id,name,email,password);
    }


    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
