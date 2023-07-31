/*
Информационная сеть поражена. Новости не отражают подлинной ситуации.
Итак, теперь, когда все задачи решены, ты сможешь написать антивирус,
который остановит взлом ТВ канала. Нужно остановить атаку вирусов, идущих по ТВ каналу.
При помощи трех антивирусных утилит, которые могут наносить повреждения вирусам.

Тебе нужно правильно расставить вывод в консоль, чтобы на экран вывелось:
Интегрируем антивирусные утилиты - JavaRush Monitor, JavaRush Guard,
JavaRush Security в систему, сканируем канал, очищаем вирусы и баги.

Требования:
•	Текст должен выводиться согласно условию.
•	Нельзя изменять (можно менять местами) или добавлять команды, отвечающие за вывод.
•	Нельзя добавлять, удалять или изменять переменные, объявленные в методе main.
 */
package task01;

public class task11 {
    public static void main(String[] args) {
        String integrate = "Интегрируем ";
        String utils = "антивирусные утилиты - ";
        String soft = "JavaRush Monitor, JavaRush Guard, JavaRush Security ";
        String system = "в систему, ";
        String scan = "сканируем канал, ";
        String remove = "очищаем вирусы и баги.";

        System.out.print(integrate);
        System.out.print(utils);
        System.out.print(soft);
        System.out.print(system);
        System.out.print(scan);
        System.out.println(remove);
    }
}
