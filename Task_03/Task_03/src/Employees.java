public class Employees extends Salary{
    protected String name;
    protected String soname;
    protected int age;

    public String getName() {
        return name;
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


    @Override
    double salary(String payment) {
        if (payment.equals("hourly")) {
            return days * hours * bid;
        } else {
            return fixedSalary;
        }
    }

}
