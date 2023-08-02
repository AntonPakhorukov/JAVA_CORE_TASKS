import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
(один из потомков) и фиксированной оплатой (второй потомок).
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
Для «повременщиков» формула для расчета такова:
«среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
б) Создать на базе абстрактного класса массив сотрудников и заполнить его.
в) ** Реализовать интерфейсы для возможности сортировки массива
(обратите ваше внимание на интерфейсы Comparator, Comparable)
г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Создать на базе абстрактного класса массив сотрудников и заполнить его.
         */
        Forwarder forwarder = new Forwarder("Garry", "Potter", 20);
        Forwarder forwarder1 = new Forwarder("Ronald", "Weasley", 19);
        Dispatcher dispatcher = new Dispatcher("Hermione", "Granger", 18);
        Dispatcher dispatcher1 = new Dispatcher("Severus", "Snape", 38);

        Salary[] fondSalary = {forwarder1, dispatcher, forwarder, dispatcher1};

        for (Salary fond: fondSalary) {
            System.out.println(fond.salary(fond.getClass().getSimpleName()));
        }
        Comparator<Salary> comparator = new Comparator<Salary>() {
            @Override
            public int compare(Salary o1, Salary o2) {
                if (o1.salary(o1.getClass().getSimpleName()) == o2.salary(o2.getClass().getSimpleName())){
                    return 0;
                } else if (o1.salary(o1.getClass().getSimpleName()) < o2.salary(o2.getClass().getSimpleName())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Comparator<Employee> comporator2 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.salary(o1.getClass().getSimpleName()) == o2.salary(o2.getClass().getSimpleName())){
                    return 0;
                } else if (o1.salary(o1.getClass().getSimpleName()) < o2.salary(o2.getClass().getSimpleName())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
//        Collections.sort(Arrays.stream(fondSalary).toList(), comparator);
//        Collections.sort(Arrays.stream(fondSalary).toList());

        System.out.println();
        for (Salary fond : fondSalary) {
            System.out.println(fond.salary(fond.getClass().getSimpleName()));
        }

        /**
         * Реализовать возможность вывода данных с использованием foreach
         * Видимо не совсем понял задание...
         */
        for (ListEmployee hymn: ListEmployee.people) {
            System.out.println(hymn);
        }





    }

}