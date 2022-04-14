import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuWork = true;
        People people = new People();


        while (menuWork)
        {
            System.out.println("wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia ");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("9. Wyjscie ");

            int menuChoice = scanner.nextInt();

            switch (menuChoice)
            {
                case 1 -> people.displayGuests();
                case 2 -> people.addGuest();
                case 3 -> people.displayfood();
                case 4 -> people.displayGuestByPhone();
                case 9 -> menuWork= false;
            }
        }


    }
}