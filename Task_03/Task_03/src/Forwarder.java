import java.io.StringReader;

public class Forwarder extends Employees implements PrintEmployees{
    private static final String PAYMENT = "hourly";
    private final String DEPARTMENT = "Forwarder";
    private static double days = 20.8;
    private static int hours = 8;
    private static double bid = 400;

    public static double getDays() {
        return days;
    }

    public static int getHours() {
        return hours;
    }

    public static double getBid() {
        return bid;
    }

    public String getPayment() {
        return PAYMENT;
    }

    public String getDepartment() {
        return DEPARTMENT;
    }

    public Forwarder(String name, String soname, int age) {
        this.name = name;
        this.soname = soname;
        this.age = age;
    }

    @Override
    public void printEmployees() {
        PrintEmployees.super.printEmployees();
        System.out.printf("Salary: %.2f\n", salary(getPayment()));
    }
}
