package Lesson4;

import java.util.*;

public class Phonebook {

private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }
    public void add(String name, String number){
        List<String> numberslist;
        if(book.containsKey(name)) numberslist = book.get(name);
        else {
            numberslist = new ArrayList<>();
        }
        numberslist.add(number);
        book.put(name, numberslist);
        System.out.println(String.format("Фамилия: " + name + ". Номер: " + number));
    }

    public List<String> get(String name){
        if(book.containsKey(name)){
            return book.get(name);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии " + name));
            return new ArrayList<>();
        }
    }
}
