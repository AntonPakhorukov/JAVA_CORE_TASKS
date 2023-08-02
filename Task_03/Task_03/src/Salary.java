/**
 * Абстрактный метод расчета ЗП
 */
public abstract class Salary extends ListEmployee implements Comparable<Salary> {
    abstract double salary(String payment);
    @Override
    public int compareTo(Salary o) {
        if (this.salary(this.getClass().getSimpleName()) == o.salary(o.getClass().getSimpleName())){
            return 0;
        } else if (this.salary(this.getClass().getSimpleName()) < o.salary(o.getClass().getSimpleName())) {
            return -1;
        } else {
            return 0;
        }

//        if (this == o) return 0;
//        return this.compareTo(o);
    }

}
