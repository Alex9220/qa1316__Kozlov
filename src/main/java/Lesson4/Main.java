package Lesson4;


import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(new String[]{
                "Таджикистан", "Киргизия", "Туркмения", "Узбекистан",
                "Косово", "Киргизия", "Иран", "Киргизия", "Конго", "Чад", "Афганистан", "Пакистан",
                "Иран", "Конго", "Киргизия", "Чад"}
        );

        Set<String> unique = new HashSet<String>(Collections.unmodifiableList(words));

        System.out.println("Список слов: " + words);
        System.out.println("Уникальные слова: " + unique);
        System.out.println("Сколько раз встречается каждое слово:");
        for (String word : unique) {
            System.out.println(word + ": " + Collections.frequency(words, word));
        }


// ------------------------------------------------------------------/


        Phonebook phonebook = new Phonebook();

        System.out.println("\nЗаполняем справочник: ");
        phonebook.add("Иванов", "1112233");
        phonebook.add("Иванов", "2223344");
        phonebook.add("Петров", "3334455");
        phonebook.add("Сидоров", "4445566");
        phonebook.add("Сидоров", "5556677");




        phonebook.get("Иванов");
        phonebook.get("Иванов");
        phonebook.get("Сидоров");

        System.out.println ("\nСпровочник содержит: ");
        System.out.println("Фамилия: Иванов. " + "Доступные номера: " + phonebook.get("Иванов"));
        System.out.println("Фамилия: Петров. " + "Доступные номера: " + phonebook.get("Петров"));
        System.out.println("Фамилия: Сидоров. " + "Доступные номера: " + phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Кузнецов"));



    }

}
