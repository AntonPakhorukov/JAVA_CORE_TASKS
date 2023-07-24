public class Dispatcher extends Employees implements PrintEmployees{
    private static final String PAYMENT = "fixed";
    private final String DEPARTMENT = "Dispatcher";
    private static int fixedSalary = 45000;

    public static int getFixedSalary() {
        return fixedSalary;
    }

    public String getPayment() {
        return PAYMENT;
    }

    public String getDepartment() {
        return DEPARTMENT;
    }

    public Dispatcher(String name, String soname, int age) {
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
