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
        Forwarder forwarder = new Forwarder("Garry", "Potter", 20);
        forwarder.printEmployees();
        System.out.println();
        Forwarder forwarder1 = new Forwarder("Ronald", "Weasley", 19);
        forwarder1.printEmployees();
        System.out.println();
        Dispatcher dispatcher = new Dispatcher("Hermione", "Granger", 20);
        dispatcher.printEmployees();
        System.out.println();
        Dispatcher dispatcher1 = new Dispatcher("Severus", "Snape", 38);
        dispatcher1.printEmployees();



    }
}
