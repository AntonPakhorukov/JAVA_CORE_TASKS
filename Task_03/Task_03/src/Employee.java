/**
 * Родительский класс
 * В нем же реализация метода расчет ЗП
 */
public class Employee extends Salary {
    protected String name;
    protected String soname;
    protected int age;

    public String getName() {
        return getName();
    }

    public String getSoname() {
        return soname;
    }
    public int getAge() {
        return age;
    }

    double days = Forwarder.getDays();
    int hours = Forwarder.getHours();
    double bid = Forwarder.getBid();
    int fixedSalary = Dispatcher.getFixedSalary();


//    @Override
//    double salary(String payment) {
//        if (payment.equals("hourly")) {
//            return days * hours * bid;
//        } else {
//            return fixedSalary;
//        }
//    }
    @Override
    double salary(String department) {
        if (department == "Forwarder") {
            return days * hours * bid;
        } else {
            return fixedSalary;
        }
    }
}
