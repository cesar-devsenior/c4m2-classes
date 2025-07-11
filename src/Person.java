public class Person {
    // Atributes
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Constructors
    public Person() {
        this("", "");
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public Person(String firstName, String lastName, String email) {
        this(firstName, lastName, email, "");
    }

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Person: fullName=%s %s, email=%s, phone=%s",
                firstName, lastName, email, phoneNumber);
    }

}
