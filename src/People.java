import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
    private List<Guest> guests = new ArrayList<>();
    Scanner scan=new Scanner(System.in);

    public void addGuest()
    {
        System.out.println("Podaj imie gościa");
        String name = scan.nextLine();

        System.out.println("Podaj nazwe ulubionego posiłku ");
        String preferEat = scan.nextLine();

        System.out.println("Podaj numer telefonu ");
        int phoneNumber = Integer.valueOf(scan.nextLine());

        System.out.println("Podaj płeć ");
        String gender = scan.nextLine();

        Guest guest = new Guest(name, preferEat, phoneNumber, gender);
        guests.add(guest);

    }

    public void displayGuests()
    {
        for (Guest guest : guests)
        {
            System.out.println(guest);
        }
    }
    
}
