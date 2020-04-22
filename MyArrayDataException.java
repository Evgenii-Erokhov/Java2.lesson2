package lesson2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String count, int i, int j) {
        super("Не числовое значение " + "'" + count + "'" + " в ячейке [" + i + "][" + j + "]");
    }
}
