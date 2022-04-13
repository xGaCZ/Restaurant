public class Guest {
    private String name;
    private String preferEat;
    private int phoneNumber;
    private String gender;

    public Guest(String name, String preferEat, int phoneNumber, String gender) {
        this.name = name;
        this.preferEat = preferEat;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getPreferEat() {
        return preferEat;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }
}
