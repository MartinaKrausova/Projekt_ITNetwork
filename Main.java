import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InsuredPersonsManagement management = new InsuredPersonsManagement();

        while (true) {
            // Výpis menu
            System.out.println("1. Přidat pojištěnce");
            System.out.println("2. Zobrazit všechny pojištěné");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Ukončit");
            System.out.println("Vyberte možnost: ");

            // Načtení volby uživatele
            int choice = Integer.parseInt(scanner.nextLine());

            // Výběr podle volby uživatele
            switch (choice) {
                case 1:
                    // Přidání nového pojištěnce
                    management.addInsuredPerson();
                    break;
                case 2:
                    // Zobrazení všech pojištěnců
                    management.displayInsuredPersons();
                    break;
                case 3:
                    // Vyhledání pojištěnce
                    management.searchInsuredPerson();
                    break;
                case 4:
                    // Ukončení programu
                    System.exit(0);
                    break;
                default:
                    // Chybná volba
                    System.out.println("Chybná možnost, zkuste to znovu");
                    break;
            }

            // Výpis zprávy po dokončení operace
            System.out.println("Pro pokračování stiskněte libovolnou klávesu.");

            // Načtení stisknuté klávesy pro pokračování
            scanner.nextLine();
        }
    }
}
