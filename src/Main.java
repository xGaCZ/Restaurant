import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuWork = true;
        People people = new People();


        while (menuWork)
        {
            System.out.println("wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa ");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("9. Wyjscie ");

            int menuChoice = scanner.nextInt();

            switch (menuChoice)
            {
                case 1 -> people.displayGuests();
                case 2 -> people.addGuest();
                case 3 -> System.out.println("wybrano 3");
                case 4 -> System.out.println("wybrano 4");
                case 9 -> menuWork= false;
            }
        }


    }
}