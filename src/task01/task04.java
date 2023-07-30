/*
Удали ненужные строки кода, чтобы на экран вывелась надпись:
Сбрасываем Диего
Сбрасываем сверхсекретный груз

Примечание: каждое предложение с новой строки.

Требования:
•	Текст должен начинаться с "Сбрасываем Диего".
•	Текст должен заканчиваться на "Сбрасываем сверхсекретный груз".
•	Нельзя изменять (можно удалить) или добавлять команды, отвечающие за вывод.
 */
package task01;

public class task04 {
    public static void main(String[] args) {
        String drop = "Сбрасываем";
        String diego = "Диего";
        String secret = "сверхсекретный";
        String cargo = "груз";

        //System.out.print(diego);
        System.out.print(drop);
        //System.out.print("Амиго");
        System.out.print(" Диего");
        System.out.println();
        System.out.print(drop);
        //System.out.print(secret);
        System.out.print(" сверхсекретный ");
        //System.out.print("код");
        System.out.print(cargo);
    }
}
