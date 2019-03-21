package com.epam.cources2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Hello2 {
    public static void main(String[] args) throws Exception
    {
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream("/home/genya9000/Документы/root/src/com/epam/cources/Hello.java");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("/home/genya9000/Документы/root/src/com/epam/cources2/Hello.java");

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            outputStream.write(data); // и записать его во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }

}
