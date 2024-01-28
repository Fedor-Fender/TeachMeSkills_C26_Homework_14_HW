package by.techmeskills.homework14.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Задача 1:
 * Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
 * пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
 * все пробелы на знак нижнего подчеркивания.
 */
public class File {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input your sentence");
        String row = scanner.nextLine();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("d:\\C26-onl. Java\\tms.txt");
            fileOutputStream.write(row.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int i;
        FileInputStream fileInputStream = new FileInputStream("d:\\C26-onl. Java\\tms.txt");
        while ((i = fileInputStream.read()) != -1) {
            String str = new String(String.valueOf((char) i).replace(" ", "_"));// правильно ли все написано?
            System.out.print(str);
        }
        fileInputStream.close();
    }
}
