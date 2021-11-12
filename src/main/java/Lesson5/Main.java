package Lesson5;

import java.io.*;
import java.util.Arrays;

/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
        Структура csv файла:
        | Строка заголовок с набором столбцов |
        | Набор строк с целочисленными значениями |
        | * Разделитель между столбцами - символ точка с запятой (;) |

        Пример:
        Value 1;Value 2;Value 3
        100;200;123
        300,400,500
        Для хранения данных использовать класс вида:
public class AppData {
    private String[] header;
    private int[][] data;

    // ...
}
    Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.*/


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file1.csv");
        PrintWriter pw = new PrintWriter(file);

         pw.println("Value 1;Value 2;Value 3;Value 4");
         pw.println("100;200;123;4");
         pw.println("300;400;500;600");
        pw.println("700;800;900;1000");
         pw.close();



        AppData data = new AppData();
        data.readFile("file1.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_file2.csv");
    }

}

