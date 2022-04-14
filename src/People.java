import java.util.*;

public class People {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneGuest =new HashMap<>();
    Scanner scan=new Scanner(System.in);

    public void addGuest()
    {
        System.out.println("Podaj imie goscia");
        String name = scan.nextLine();

        System.out.println("Podaj nazwe ulubionego posilku ");
        String preferEat = scan.nextLine();

        System.out.println("Podaj numer telefonu ");
        int phoneNumber = Integer.valueOf(scan.nextLine());

        System.out.println("Podaj plec ");
        String gender = scan.nextLine();

        Guest guest = new Guest(name, preferEat, phoneNumber, gender);
        meals.add(preferEat);
        phoneGuest.put(phoneNumber, guest);
        guests.add(guest);

    }

    public void displayGuests()
    {
        for (Guest guest : guests)
        {
            guest.betterDisplayGuest();
        }
    }
    public void displayfood()
    {
        for (String meal : meals)
        {
            System.out.println(meal);
        }
    }
    public void displayGuestByPhone()
    {
        System.out.println("Prosze podac numer telefonu ");
        Integer phoneNumber = Integer.valueOf(scan.nextLine());
        Guest guest = phoneGuest.get(phoneNumber);
        guest.betterDisplayGuest();

    }
    
}
