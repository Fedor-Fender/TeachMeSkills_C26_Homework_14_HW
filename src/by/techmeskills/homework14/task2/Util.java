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
public class Util {
    public static void main(String[] args) throws IOException {

        String str =  "Cognosce te ipsum";

        try {
            FileWriter fileWriter = new FileWriter("d:\\C26-onl. Java\\tms2.txt");
            fileWriter.write(str);
            fileWriter.close();

            System.out.println("Content was written successfully.");

        } catch (IOException e) {
            throw new RuntimeException(e);// правильные ли исключения?
        }
        try {
            FileReader fr = new FileReader("d:\\C26-onl. Java\\tms2.txt");

            StringBuilder str1 = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                char a = (char) i;
                str1.append(a);
            }
            fr.close();
            System.out.println("output first symbol:"+str1.charAt(0));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);// правильно ли все домучал с заданием? есть ли замечания по коду?:)

        }
    }
}
