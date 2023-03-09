public class Person {
    private String name;
    private int age;
    private String email;
    private int pnumber;

    public Person(String name, int age, String email, int pnumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.pnumber = pnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPnumber() {
        return pnumber;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", pnumber=" + pnumber;
    }
}
