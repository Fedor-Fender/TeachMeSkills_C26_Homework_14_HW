package by.techmeskills.homework14.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Задача 2:
 * Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
 * “Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву.
 */
public class FileUtilWrite {
    public static void main(String[] args) throws IOException {

        String str = "Cognosce te ipsum";

        try {
            FileWriter fileWriter = new FileWriter("d:\\C26-onl. Java\\tms2.txt");
            fileWriter.write(str);
            fileWriter.close();

            System.out.println("Content was written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int i;
        try {
            FileReader fr = new FileReader("d:\\C26-onl. Java\\tms2.txt");
            while ((i = fr.read()) != -1) {
                String str1 = new String(valueOf((char) i).charAt(0)));
                System.out.print(str1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
}
