/**
 * Класс наследник 1
 * В нем указаны данные для расчета ЗП, сеттеры делать не стал
 */
public class Forwarder extends Employee implements PrintEmployee {
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
        people.add(this);
    }

    @Override
    public void printEmployees() {
        PrintEmployee.super.printEmployees();
        System.out.printf("Salary: %.2f\n", salary(getPayment()));
    }
    private double salary = salary(getDepartment());

    @Override
    public String toString() {
        return "Forwarder (" +
                "name: '" + name + '\'' +
                ", soname: '" + soname + '\'' +
                ", age: " + age + '\'' +
                ", Department: '" + DEPARTMENT + '\'' +
                ", salary: " + salary +
                ')';
    }
}
