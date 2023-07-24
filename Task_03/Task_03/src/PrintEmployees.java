public interface PrintEmployees {
    String getName();
    String getSoname();
    int getAge();
    String getDepartment();
    String getPayment();
    default void printEmployees() {
        System.out.printf("Name: %s\nSoname: %s\nAge: %d\nDepartment: %s\nPayment: %s\n",
                getName(), getSoname(), getAge(), getDepartment(), getPayment());
    }
}
