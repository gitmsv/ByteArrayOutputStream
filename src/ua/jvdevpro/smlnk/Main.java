package ua.jvdevpro.smlnk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Создание объекта байтового потока вывода;

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        byte [] buff = {'a'};

        // Запись данных в буфер всегда выполняется внутри блока try;

        try {
            b.write(buff);
            b.write('b');
            String str="HELLO";
            b.write(str.getBytes());

        } catch (IOException e) {
            System.out.println("Error!");
        }

        // Получение массива byte на основе заполненного потока;

        byte [] c = b.toByteArray();
        for (int i = 0; i <c.length; i++) {
            System.out.println((char) c[i]);
        }
    }
}
