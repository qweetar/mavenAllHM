package com.htp.kuzmenok.task2;

public class Lesson2Arrays {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // intialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 8: " + anArray[8]);

        // Creating, Initealizing, and Accessing an Array

        int[] secondKindOfArray = new int[10];

        int[] oneOfTypeInit = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900,
                1000
        };

        for(int i = 0; i < oneOfTypeInit.length; i++) {
            System.out.print(oneOfTypeInit[i] + " ");
        }
        System.out.println();

        // 2D Array

        int[][] intArray2D = new int[2][10];

        String[][] names = {
                {"Mr. ", "Mrs. ", " Ms. "},
                {"Smith", "Jones"}
        };

        for (int i = 0; i < names.length; i++) {
            for ( int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
        //Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        //Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

        // Array Copying

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        //Ctrl+p
        //Crtl+Q
        System.arraycopy(copyFrom, 0, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        // Different For statements
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        System.out.println();
        for(int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        System.out.println();

        // Print with while
        int j = 0;
        while (j < myList.length) {
            System.out.print(myList[j] + " ");
            j++;
        }

        System.out.println();

        // Print with do while

        int z = 0;
        do {
            System.out.print(myList[z] + " ");
            z++;
        } while (z < myList.length);


    }
}
