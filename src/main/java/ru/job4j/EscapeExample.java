package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String string = "Я изучаю \"сайте\" экранирование символов";
        System.out.println(string);
        System.out.println('\'');
        System.out.println('\"');
        System.out.println("C:\\projects\\job4j\\File.java");
        /* \r возвращает курсор в начало строки, "обнуляя" её */
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print("Первая строка\nВторая строка");
        /* \f - Прогон страницы
        * Переводит документ на новую страницу. Неиспользуемый спецсимвол.
        */
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        /* \b - Возврат курсора на одну позицию назад
        * Работает как BackSpace - стирает один символ позади текущего положения курсора.
        * */
        System.out.println("JoJojjj\b\b");
    }
}
