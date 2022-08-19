package WeekTest;
public class Student {
    int id;
    String firstName, lastName, city, trackStack;
    long mobileNo;

    /*public Student() {
    }
*/
     Student(int id, String firstName, String lastName, String city, String trackStack, long mobileNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.trackStack = trackStack;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Enter your id : ");
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Enter your First name : ");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Enter your Last name : ");
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Enter your city : ");
        this.city = city;
    }

    public String getTrackStack() {
        return trackStack;
    }

    public void setTrackStack(String trackStack) {
        System.out.println("Enter your Track stack : ");
        this.trackStack = trackStack;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        System.out.println("Enter your mobile number : ");
        this.mobileNo = mobileNo;
    }
}
