package com.htp.kuzmenok.task10.task_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextReader_Task3 {
    public static void main (String[] args) {
        try {
            // Read the file with text
            FileReader fileReader = new FileReader("D:\\Htp course\\Tasks\\mavenHM\\src\\main\\java\\com\\htp\\kuzmenok\\task10\\task_3\\Text.txt");
            BufferedReader br = new BufferedReader(fileReader);
            List<String> textFile = new ArrayList<>();
            String text;
            while ((text = br.readLine()) != null ) {
                textFile.add(text);
            } br.close();
            System.out.println(textFile + "\n");

            // Swap first and last words in statements
            List<String> changendTextFile = new ArrayList<>();
            for (String str : textFile) {
                String[] tempArray = str.split("[\\s!.?]");
                String tempVar = tempArray[tempArray.length - 1];
                tempArray[tempArray.length - 1] = tempArray[0];
                tempArray[0] = tempVar;
            // Save result in new ArrayList
                changendTextFile.add(String.join(" ", tempArray));
                }
                for (String showStr : changendTextFile) { // Show the result
                    System.out.println(showStr);
                }
        } catch (FileNotFoundException e) {
            System.out.println("There is no file with text");
        } catch (IOException e) {
            System.out.println("Error input/output: " + e.toString());
        }
    }
}
