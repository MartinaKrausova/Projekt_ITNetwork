import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsuredPersonsManagement {
    // vytvoření seznamu insuredPersons typu List s datovým typem InsuredPerson
    private List<InsuredPerson> insuredPersons = new ArrayList<>();
    // vytvoření instance scanner
    private Scanner scanner = new Scanner(System.in);

    // metoda pro přidání nového pojištěnce
    public void addInsuredPerson() {
        // načtení vstupu od uživatele pomocí scanneru
        System.out.print("Zadejte jméno: ");
        String firstName = scanner.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = scanner.nextLine();
        System.out.print("Zadejte věk: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Zadejte telefonní číslo: ");
        String phoneNumber = scanner.nextLine();

        // vytvoření nové instance pojištěnce a přidání do seznamu insuredPersons
        insuredPersons.add(new InsuredPerson(firstName, lastName, age, phoneNumber));
        System.out.println("Pojištěný úspěšně vytvořen.");
    }

// metoda pro výpis všech pojištěnců v seznamu
    public void displayInsuredPersons() {
        if (insuredPersons.isEmpty()) {
            System.out.println("Nenalezeny žádné záznamy.");
        } else {
            for (InsuredPerson insuredPerson : insuredPersons) {
                System.out.println(insuredPerson);
            }
        }
    }

    // metoda pro vyhledání pojištěnce podle jména a příjmení
    public void searchInsuredPerson() {
        System.out.print("Zadejte jméno: ");
        String firstName = scanner.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = scanner.nextLine();

        boolean found = false;
        for (InsuredPerson insuredPerson : insuredPersons) {
            // porovnání jména a příjmení pojištěnce s vstupem od uživatele
            if (insuredPerson.getFirstName().equals(firstName) && insuredPerson.getLastName().equals(lastName)) {
                System.out.println(insuredPerson);
                found = true;
                break;
            }
        }

        // výpis zprávy, pokud pojištěný nebyl nalezen
        if (!found) {
            System.out.println("Pojištěný nenalezen!");
        }
    }
}
