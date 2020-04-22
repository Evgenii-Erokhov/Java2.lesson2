package lesson2;

public class StrArr {

    private static final int SIZE = 4;

    private static String[][] Data = new String[][]{
         {"0", "8", "3", "5"},
         {"8", "9", "2", "4"},
         {"2", "1", "4", "6"},
         {"8", "0", "9", "3"},
    };

    public static void main(String[] args) {
        try {
            int result = sumArray(Data);
            System.out.println("Сумма: " + result);
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
        }
    }

    private static int sumArray(String[][] data) {
        checkSize(data);

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            String[] str = data[i];
            for (int j = 0; j < str.length; j++) {
                String count = str[j];
                try {
                    sum += Integer.parseInt(count);
                    } catch (NumberFormatException e) {
                    throw new MyArrayDataException(count, i, j);
                }
            }
        }
        return sum;
    }

    private static void checkSize(String[][] data) {
        if (data.length != SIZE) {
            throw new MyArraySizeException();
        }

         for (String[] str : data) {
            if (str.length != SIZE) {
                throw new MyArraySizeException();
            }
         }
    }
}
