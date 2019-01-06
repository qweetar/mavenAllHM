package com.htp.kuzmenok.task10.task_1;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class JavaClassFileReader_Task1 {
    public static void main (String[] args) {
        List<String> textClass = new ArrayList<>();
        System.out.println("Class before the change of access modifiers: ");
        try {
            FileReader fr = new FileReader("D:\\Htp course\\Tasks\\mavenHM\\src\\main\\java\\com\\htp\\kuzmenok\\task10\\task_1\\Book.java");
            BufferedReader br = new BufferedReader(fr);
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
                textClass.add(s);
            }
            fr.close();
            System.out.println("________________________________________________");
            System.out.println("\nClass after change of access modifiers: ");
            for(String string : textClass) {
                System.out.println(string.replace("public", "private"));
            }
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
