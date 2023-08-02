public class ArrayException extends Exception{
    private int valueI, valueJ;
    public int getValueI() {
        return valueI;
    }
    public int getValueJ() {
        return valueJ;
    }
    public ArrayException(String message) {
        super(message);
    }
    public ArrayException(String message, int i, int j) {
        super(message);
        this.valueI = i;
        this.valueJ = j;
    }
}
