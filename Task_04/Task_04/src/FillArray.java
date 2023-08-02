public class FillArray {
    public static String[][] fillArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String temp = String.valueOf(i + j);
                array[i][j] = temp;
            }
        }
        return array;
    }
}
