/**
 * Задача:
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
 * просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
 * ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 * MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения
 * MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Создаем строковый массив.
         * Метод createArray запрашивает у пользователя количество строк и столбцов.
         * Заполняем массив методом fillArray.
         * Проверяем массив на размерность методом checkArray, в нем же вызываем метод
         * cellSumOfArray для суммирования элементов массива.
         * Если размер массива не соответствует размеру 4*4 -> выбрасывает исключение.
         * Если ячейку массива невозможно преобразовать в int, выбрасывает исключение.
         * Распечатываем двумерный массив.
         */
        String[][] arr = CreateArray.createArray();
        FillArray.fillArray(arr);
        try {
            arr[2][3] = "char";
            CheckArray.checkArray(arr);
            PrintArray.printArray(arr);
        } catch (MyArraySizeException e){
            System.err.println(e.getMessage());
        } catch (MyArrayDataException e){
            System.err.printf("Массив содержит символ или строку в ячейке %d,%d", e.getValueI(), e.getValueJ());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Вводимое значение не в пределах размерности массива");
        }
    }
}
