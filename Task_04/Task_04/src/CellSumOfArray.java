import static java.lang.Integer.parseInt;
public class CellSumOfArray {
    public static int cellSumOfArray(String[][] array) throws MyArrayDataException {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (isNumber(array[i][j])) {
                    value += parseInt(array[i][j]);
                } else {
                    throw new MyArrayDataException("Массив содержит символ или строку в ячейке %d %d", i, j);
                }
            }
        }
        return value;
    }
    private static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
