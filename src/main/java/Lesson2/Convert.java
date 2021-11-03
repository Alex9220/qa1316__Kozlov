package Lesson2;

public class Convert {
    public static int cellConvert(String[][] table) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (table.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < table[i].length; j++) {
                try {
                    count += Integer.parseInt(table[i][j]);
                }
                catch (NumberFormatException cell) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
