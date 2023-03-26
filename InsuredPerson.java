public class InsuredPerson {
    private String firstName; // Jméno pojištěnce
    private String lastName; // Příjmení pojištěnce
    private int age; // Věk pojištěnce
    private String phoneNumber; // Telefonní číslo pojištěnce

    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return   "Jméno a Příjmení: " +
                firstName + " " +
                lastName + ", " +
                "Věk: " +
                age + ", " +
                "Kontakt: " +
                phoneNumber
                ;
    }
}
