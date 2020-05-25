package lesson2;

public class MyArrayDataException extends RuntimeException {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyArrayDataException(int number) {
        this.number = number;
    }

    public MyArrayDataException(String message, int number) {
        super(message);
        this.number = number;
    }
}
