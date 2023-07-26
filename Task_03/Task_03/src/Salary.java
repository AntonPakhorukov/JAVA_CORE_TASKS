/**
 * Абстрактный метод расчета ЗП
 */
public abstract class Salary extends ListEmployee implements Comparable<Salary> {
    abstract double salary(String payment);
    @Override
    public int compareTo(Salary o) {
        if (this == o) return 0;
        return this.compareTo(o);
    }

}
