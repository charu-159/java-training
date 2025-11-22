package lec12;

class Aadhaar {
    private String name;
    private String aadhaarNumber;
    private String dob;
    private String address;
    private String gender;
    private String mobile;

    // Constructor
    public Aadhaar(String name, String aadhaarNumber, String dob, String address, String gender, String mobile) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.mobile = mobile;
    }

    // Show Aadhaar details
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobile);
    }

    // Update address
    public void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address updated: " + address);
    }

    // Update mobile
    public void updateMobile(String newMobile) {
        mobile = newMobile;
        System.out.println("Mobile updated: " + mobile);
    }

    // Password check
    public void password(int pin) {
        if (pin == 12345) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
    }
}

public class aadharcard {
    public static void main(String[] args) {
        Aadhaar card = new Aadhaar("Charu Patel", "1234-5678-9012", "01-01-2000", "Jabalpur, MP", "Female", "9876543210");

        card.showDetails();
        card.updateAddress("Bhopal, MP");
        card.updateMobile("9123456789");
        card.password(12345);
    }
}