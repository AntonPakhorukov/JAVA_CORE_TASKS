/**
 * Класс наследник 2
 * Указана фикса по ЗП
 */
public class Dispatcher extends Employee implements PrintEmployee {
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
        return "Dispatcher (" +
                "name: '" + name + '\'' +
                ", soname: '" + soname + '\'' +
                ", age: " + age + '\'' +
                ", Department: '" + DEPARTMENT + '\'' +
                ", salary: " + salary +
                ')';
    }
}
