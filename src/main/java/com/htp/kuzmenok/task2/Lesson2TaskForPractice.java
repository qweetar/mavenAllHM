package com.htp.kuzmenok.task2;

import java.util.Arrays;


public class Lesson2TaskForPractice {
    public static void main(String[] args) {


        // Task 1
        System.out.println("Task 1");

        int[] numArray1 = {100, 60, 40, 80, 50, 70, 20, 30, 10, 90};

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < numArray1.length; i++) {
                int tempNum;
                if (numArray1[i - 1] > numArray1[i]) {
                    tempNum = numArray1[i - 1];
                    numArray1[i - 1] = numArray1[i];
                    numArray1[i] = tempNum;
                    flag = true;
                }

            }
        }
        System.out.print("Sorted numArray1: ");
        for (int j = 0; j < numArray1.length; j++) {
            System.out.print(numArray1[j] + " ");
        }
        System.out.println();

        String[] textArray1 = {"Bond", "Smith", "Noel", "Light", "Ramsey"};
        Arrays.sort(textArray1);
        System.out.print("Sorted textArray1: ");
        for (int w = 0; w < textArray1.length; w++) {
            System.out.print(textArray1[w] + " ");
        }


        // Task 2
        System.out.println();
        System.out.println();
        System.out.println("Task 2");

        int[] numArray2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int i = 0; i < numArray2.length; i++) {
            sum += numArray2[i];
        }
        System.out.println("Result: " + sum);

        // Task 3
        System.out.println();
        System.out.println("Task 3");

        char tire = '-';
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.print(tire);
            }
            System.out.println();
        }


        // Task 4
        System.out.println();
        System.out.println("Task 4");

        int[] numArray4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int count = 0;
        int average = 0;
        for (int i = 0; i < numArray4.length; i++) {
            count += numArray4[i];
        }
        average = count / numArray4.length;
        System.out.println("Average number:" + average);


        // Task 5
        System.out.println();
        System.out.println("Task 5");

        int[] numArray5 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int numRandom = 50;
        for (int i = 0; i < numArray5.length; i++) {
            if (numRandom == numArray5[i]) {
                System.out.println("We have got the number!");
                break;
            } else {
                System.out.println("Keep trying");
            }
        }

        // Task 6
        System.out.println();
        System.out.println("Task 6");

        int[] numArray6 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int numWeKnow = 50;
        for (int i = 0; i < numArray6.length; i++) {
            if (numWeKnow == numArray6[i]) {
                System.out.println("Number: " + numWeKnow + " has index: " + i);
            }
        }

        // Task 7
        System.out.println();
        System.out.println("Task 7");

        int[] numArray7 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int del = 3;
        System.out.print("Array before: ");
        for (int k = 0; k < numArray7.length; k++) {
            System.out.print(numArray7[k] + " ");
        }

        for (int i = 0; i < numArray7.length; i++) {
            if (del == i) {
                for (int j = i + 1; i < numArray7.length - 1; j++) {
                    numArray7[i] = numArray7[j];
                    i++;
                }
            }
        }
        System.out.println();
        System.out.print("Array after delete: ");
        for (int i = 0; i < numArray7.length - 1; i++) {
            System.out.print(numArray7[i] + " ");
        }


        // Task 8
        System.out.println();
        System.out.println();
        System.out.println("Task 8");

        int[] numArray8 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] numCopyArray = new int[numArray8.length];
        System.out.print("Copy Array is: ");
        for (int i = 0; i < numArray8.length; i++) {
            numCopyArray[i] = numArray8[i];
            System.out.print(numCopyArray[i] + " ");
        }

        // Task 9
        System.out.println();
        System.out.println();
        System.out.println("Task 9");


        int[] numArray9 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int pos = 3;
        int numToAdd = 200;

        System.out.print("Array before: ");
        for (int i = 0; i < numArray9.length; i++) {
            System.out.print(numArray9[i] + " ");
        }
        System.out.println();

        int[] tempArray9 = new int[numArray9.length + 1];
        int y = 0;

        for (int i = 0; i < numArray9.length; i++) {

            if (i != pos) {
                tempArray9[y] = numArray9[i];
               y++;
            } else {
                tempArray9[y] = numToAdd;
                pos = 0;
                i--;
                y++;
            }

        }
        System.out.print("Array after the insert: ");
        for (int i = 0; i < tempArray9.length; i++) {
            System.out.print(tempArray9[i] + " ");
        }


            // Task 10
            System.out.println();
            System.out.println();
            System.out.println("Task 10");


            int[] numArray10 = {3, 54, 9, 74, 92, 8};
            int max = numArray10[0];
            for (int i = 0; i < numArray10.length - 1; i++) {
                if (numArray10[i] > max) {
                    max = numArray10[i];
                }
            }
            System.out.println("Max number of array: " + max);

            int min = numArray10[0];
            for (int i = 0; i < numArray10.length; i++)
                if (numArray10[i] < min) {
                    min = numArray10[i];
                }
            System.out.println("Min number of array: " + min);

            // Task 11
            System.out.println();
            System.out.println("Task 11");

            int[] numArray11 = {3, 54, 9, 74, 92, 8};
            System.out.print("Array: ");
            for (int i = 0; i < numArray11.length; i++) {
                System.out.print(numArray11[i] + " ");
            }

            for (int i = 0; i < numArray11.length / 2; i++) {
                int temp = numArray11[i];
                numArray11[i] = numArray11[numArray11.length - i - 1];
                numArray11[numArray11.length - i - 1] = temp;
            }
            System.out.println();
            System.out.print("Array after revers: ");
            for (int i = 0; i < numArray11.length; i++) {
                System.out.print(numArray11[i] + " ");


            }

            // Task 12
            System.out.println();
            System.out.println();
            System.out.println("Task 12");

            int[] numArray12 = {4, 23, 89, 23, 9, 4};
            for (int i = 0; i < numArray12.length; i++) {
                for (int j = i + 1; j < numArray12.length; j++) {
                    if (numArray12[j] == numArray12[i]) {
                        System.out.println("Duplicate numbers: " + numArray12[i] + " and " + numArray12[j]);
                    }
                }
            }

            // Task 13
            System.out.println();
            System.out.println("Task 13");

            String[] textArray13 = {"JDavis", "Munky", "Head", "JDavis", "Fieldy", "Drummer"};

            for (int i = 0; i < textArray13.length; i++) {
                for (int j = i + 1; j < textArray13.length; j++) {
                    if (textArray13[j].equals(textArray13[i])) {
                        System.out.println("Dublicate text: " + textArray13[j] + " and " + textArray13[i]);
                    }
                }
            }

            // Task 14
            System.out.println();
            System.out.println("Task 14");

            String[] textArray13_1 = {"Violet", "Black", "White", "Brown", "Blue", "Red"};
            String[] textArray13_2 = {"Yellow", "Pink", "Green", "Red", "Purple"};

            for (int i = 0; i < textArray13_1.length; i++) {
                for (int j = 0; j < textArray13_2.length; j++) {
                    if (textArray13_2[j].equals(textArray13_1[i])) {
                        System.out.println("The same color in both Arrays is: " + textArray13_1[i]);
                    }
                }
            }

            // Task 15
            System.out.println();
            System.out.println("Task 15");

            int[] numArray15_1 = {1, 45, 62, 77, 73, 22, 54};
            int[] numArray15_2 = {99, 32, 84, 2, 9, 23, 45, 88, 12, 29};

            for (int i = 0; i < numArray15_1.length; i++) {
                for (int j = 0; j < numArray15_2.length; j++) {
                    if (numArray15_1[i] == numArray15_2[j]) {
                        System.out.println("The same numbers are: " + numArray15_1[i]);
                    }
                }
            }

            // Task 16
            System.out.println();
            System.out.println("Task 16");

            int[] numArray16 = {14, 64, 68, 22, 65, 69, 44, 22, 45, 14, 68};

            boolean flag16 = true;
            while (flag16) {
                flag16 = false;
                for (int i = 1; i < numArray16.length; i++) {
                    int tempNum;
                    if (numArray16[i - 1] > numArray16[i]) {
                        tempNum = numArray16[i - 1];
                        numArray16[i - 1] = numArray16[i];
                        numArray16[i] = tempNum;
                        flag16 = true;
                    }

                }
            }

            System.out.print("Array before: ");
            for (int k = 0; k < numArray16.length; k++) {
                System.out.print(numArray16[k] + " ");
            }

            int[] tempArray = new int[numArray16.length];

            int add = 0;
            for (int i = 0; i < numArray16.length - 1; i++) {
                if (numArray16[i] != numArray16[i + 1]) {
                    tempArray[add++] = numArray16[i];
                }
            }
            tempArray[add++] = numArray16[numArray16.length - 1];

            for (int i = 0; i < add; i++) {
                numArray16[i] = tempArray[i];
            }


            System.out.println();
            System.out.print("Array after delete: ");
            for (int i = 0; i < add; i++) {
                System.out.print(tempArray[i] + " ");
            }

            // Task 17
            System.out.println();
            System.out.println();
            System.out.println("Task 17");

            int[] numArray17 = {43, 2, 8, 12, 84, 9, 23};

            int bigestNum = 0;
            int secondBigestNum = 0;

            System.out.print("Array is: ");
            for (int i = 0; i < numArray17.length; i++) {
                System.out.print(numArray17[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < numArray17.length; i++) {
                if (numArray17[i] > bigestNum) {
                    secondBigestNum = bigestNum;
                    bigestNum = numArray17[i];
                } else if (numArray17[i] > secondBigestNum) {
                    secondBigestNum = numArray17[i];
                }
            }
            System.out.println("Second Big number is: " + secondBigestNum);

            // Task 18
            System.out.println();
            System.out.println("Task 18");

            int[] numArray18 = {23, 8, 2, 53, 98, 5, 82};
            int smallestNum = numArray18[0];
            int secondSmallestNum = numArray18[0];

            System.out.println("Array is: ");
            for (int i = 0; i < numArray18.length; i++) {
                System.out.print(numArray18[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < numArray18.length; i++) {
                if (numArray18[i] < smallestNum) {
                    secondSmallestNum = smallestNum;
                    smallestNum = numArray18[i];
                } else if (numArray18[i] < secondSmallestNum) {
                    secondSmallestNum = numArray18[i];
                }
            }
            System.out.println("The second Smallest number is: " + secondSmallestNum);

            // Task 19
            System.out.println();
            System.out.println("Task 19");

            int[][] firstArray = {
                    {1, 2, 3, 4, 5},
                    {4, 5, 6, 3, 8},
                    {4, 2, 8, 4, 4},
                    {3, 5, 6, 3, 9}
            };

            int[][] secondArray = {
                    {5, 2, 9, 2, 8},
                    {34, 8, 22, 99, 9},
                    {2, 43, 99, 1, 44},
                    {3, 5, 3, 4, 1}
            };

            System.out.println("First Array: ");
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    System.out.print(firstArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Second Array: ");
            for (int i = 0; i < secondArray.length; i++) {
                for (int j = 0; j < secondArray[i].length; j++) {
                    System.out.print(secondArray[i][j] + " ");
                }
                System.out.println();
            }


    }
}















