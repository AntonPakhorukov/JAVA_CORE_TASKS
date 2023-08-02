/**
 * Создан класс, содержащий массив сотрудников
 */

import java.util.ArrayList;
public class ListEmployee implements Comparable<Salary>{
    protected static ArrayList<ListEmployee> people = new ArrayList<>();

    public static ArrayList<ListEmployee> getPeople() {
        return people;
    }

    @Override
    public int compareTo(Salary o) {
        if (this == o) return 0;
        return this.compareTo(o);
    }
}
