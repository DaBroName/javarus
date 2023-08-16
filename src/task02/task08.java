/*
Заполни пробелы пустотой... или наоборот.

Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку "пустота пустота пустота".

Требования:
•	Не изменяй значение переменной emptiness.
•	Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness, строки с одним пробелом и конкатенацию строк.
•	Программа должна выводить на экран значение переменной fullness.
 */

package task02;

public class task08 {
    public static void main(String[] args) {
        String emptiness = "пустота";
        String fullness = emptiness + " " + emptiness + " " + emptiness; //напишите тут ваш код
        System.out.println(fullness);
    }
}
