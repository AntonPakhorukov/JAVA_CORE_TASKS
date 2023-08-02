public class CheckArray {
    public static void checkArray (String[][] check) throws MyArraySizeException, MyArrayDataException {
        if (check.length != 4 && check[0].length == 4) {
            throw new MyArraySizeException("Количество строк не равно 4");
        } else if (check.length == 4 && check[0].length != 4) {
            throw new MyArraySizeException("Количество столбцов не равно 4");
        } else if (check.length != 4 && check[0].length != 4) {
            throw new MyArraySizeException("Количество строк и столбцов не равно 4");
        }
        System.out.printf("Сумма ячеек массива = %d", CellSumOfArray.cellSumOfArray(check));
    }
}
