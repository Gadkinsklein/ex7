import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Joe mama","gjewerj@gmail.com");
        System.out.println(contact1);
        BuisnessContact bContact1 = new BuisnessContact("gjdsoijriogej","JoesMother@gmail.com","465456456413");
        System.out.println(bContact1);
    }
}

class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

class BuisnessContact extends Contact{
    private String phoneNumber;

    public BuisnessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BuisnessContact{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}

class contactCollection{

}