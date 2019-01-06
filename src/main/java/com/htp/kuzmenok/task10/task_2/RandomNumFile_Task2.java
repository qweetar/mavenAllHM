package com.htp.kuzmenok.task10.task_2;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class RandomNumFile_Task2 {
    public static final String NUM_FILE_NAME = "D:\\Htp course\\Tasks\\mavenHM\\src\\main\\java\\com\\htp\\kuzmenok\\task10\\task_2\\Num.txt";
    public static final String SORTED_NUM_FILE_NAME = "D:\\Htp course\\Tasks\\mavenHM\\src\\main\\java\\com\\htp\\kuzmenok\\task10\\task_2\\Sorted_Num.txt";
    public static void main (String[] args) {
        try {
            // Write random numbers to the file
            FileWriter fileWriter = new FileWriter(NUM_FILE_NAME);
            BufferedWriter fbw = new BufferedWriter(fileWriter);
            PrintWriter fpw = new PrintWriter(fbw);
            int[] randomNum = new int[20];
            Random random = new Random();
            for (int i = 0; i < randomNum.length; i++) {
                randomNum[i] = random.nextInt(100);
                System.out.println(randomNum[i]);
                fpw.println(randomNum[i]);
            } fbw.close();

            // Read numbers from file
            FileReader fileReader = new FileReader(NUM_FILE_NAME);
            BufferedReader fbr = new BufferedReader(fileReader);
            List<String> fileNum = new ArrayList<String>();
            String num;
            while ((num = fbr.readLine()) != null) {
                fileNum.add(num);
            } fbr.close();
            // Convert into Integer array
            List<Integer> unsortNum = new ArrayList<Integer>(fileNum.size());
            for(String stringInt : fileNum) {
                unsortNum.add(Integer.valueOf(stringInt));
            }
            System.out.println(unsortNum);
            // Sorting of ArrayList
            Collections.sort(unsortNum);
            // Sorted ArrayList
            System.out.println(unsortNum);
            // Write sorted number to the file
            FileWriter sortedFileWriter = new FileWriter(SORTED_NUM_FILE_NAME);
            BufferedWriter sfbw = new BufferedWriter(sortedFileWriter);
            PrintWriter sfpw = new PrintWriter(sfbw);
            for (Integer sstr : unsortNum) {
                sfpw.println(sstr);

            }  sfbw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Impossible to write in file: " + NUM_FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error input/output: " + e.toString());
        }



    }
}
