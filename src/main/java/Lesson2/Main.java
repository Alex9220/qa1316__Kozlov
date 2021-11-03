package Lesson2;

import static Lesson2.Convert.cellConvert;

/**
 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
 и вывести результат расчета.
*/



public class Main {
    public static void main(String[] args) {
        String[][] table = new String[][]{
                {"3", "3", "3", "1"},
                {"1", "6", "4", "4"},
                {"2", "5", "4", "2"},
                {"1", "2", "7", "2"}
        };

        String[][] table1 = new String[][]{
                {"3", "3", "3", "1"},
                {"1", "6", "4", "4"},
                {"2", "5", "4", "2"},
                {"1", "2", "7", "i"}
        };
        String[][] table2 = new String[][]{
                {"3", "3", "3", "1"},
                {"1", "6", "4", "4"},
                {"2", "5", "4", "2"},
                {"1", "2", "7", }
        };

        try {
            try {
                int result = cellConvert(table);
                System.out.println("\nСумма ячеек: " + result);
            } catch (MyArraySizeException cell) {
                System.out.println(cell.getMessage());
            }
        }
        catch (MyArrayDataException cell) {
            System.out.println(cell.getMessage());
        }
        try {
            try {
                int result = cellConvert(table1);
                System.out.println("\nСумма ячеек: " + result);
            } catch (MyArraySizeException cell) {
                System.out.println(cell.getMessage());
            }
        }
        catch (MyArrayDataException cell) {
            System.out.println(cell.getMessage());
        }
        try {
            try {
                int result = cellConvert(table2);
                System.out.println("Сумма ячеек: " + result);
            } catch (MyArraySizeException cell) {
                System.out.println(cell.getMessage());
            }
        }
        catch (MyArrayDataException cell) {
            System.out.println(cell.getMessage());
        }

    }


}

