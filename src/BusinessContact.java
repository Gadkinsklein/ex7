public class BusinessContact extends Person {
    private String email;

    public BusinessContact(String name, int age, String email, int pnumber, String email1) {
        super(name, age, email, pnumber);
        this.email = email1;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "email='" + email + '\'' +
                '}';
    }
}
