import java.util.Scanner;
public class CreateArray {
    public static String[][] createArray(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер двумерного массива через пробел: ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        String[][] result = new String[row][column];
        scan.close();
        return result;
    }
}
