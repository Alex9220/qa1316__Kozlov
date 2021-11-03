package Lesson2;

public class MyArrayDataException extends ExampleException {
    MyArrayDataException(int i, int j) {
        super(String.format("\nНекорректные данные в ячейке: [%d x %d]",i,j));}
}
