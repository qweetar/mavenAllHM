package com.htp.kuzmenok.task7;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    public static void main(String[] args) {
        String text = "Best buy has assembled a 15-plus terabyte database with seven years of data on 75 million households. " +
                "\nIt captures information about every interaction - \nfrom phone calls and mouse clicks to delivery and rebatecheck addresses and then deploys sophisticated" +
                "algorithms\n to classify over three-quarters of it's customers, or more than 100 million\n" +
                "individuals, into profiled categories such as \n'Buzz' (the young technology buff), 'Jill' (the suburban soccer mom), " +
                "\n'Barry' (the wealthy professional guy), and 'Ray' (the family man). The firm also applies a customer lifetime\n" +
                "value model that measures transaction-level profitability and factors in\n" +
                "customers behaviors that increase or decrease the value of the relationship? Knowing so much about consumers allows Best Buy to employ\n" +
                "precision marketing and customers-triggered incentive programs with positive response rates.";


        // Text before
        System.out.println(text);

        // Task 1
        System.out.println("\nTask #1\n");
        System.out.println(capitalizeText(text));

        // Task 2
        System.out.println("\nTask #2\n");
        System.out.println("Quantity of punctuation marks");
        System.out.println(punctuationCount(text));

        // Task 3
        System.out.println("\nTask #3\n");
        System.out.println(countNumbers(text));

        // Task 4
        System.out.println("\nTask #4\n");
        System.out.println(text.replace("s", "$"));

        // Task 5
        System.out.println("\nTask #5\n");
        System.out.println(text.replaceAll("\\([^)]+\\)", ""));

        // Task 6
        System.out.println("\nTask #6\n");
        countWords(text);

        // Task 7
        System.out.println("\nTask #7\n");
        countAndCompare(text);

        // Task 8
        System.out.println("\nTask #8");
        findQuestionLine(text,7);



    }

    // Method to Capitalize first letter in every word. Task 1
    public static String capitalizeText(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    // Method to count punctuation marks. Task 2
    public static String punctuationCount(String text) {
        String look;
        int comma = 0;
        int period = 0;
        int semicolon = 0;
        int colon = 0;
        int exclamation = 0;
        int question = 0;
        int dash = 0;
        int quotes = 0;
        int total = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '.':
                    period++;
                    total++;
                    break;
                case ',':
                    comma++;
                    total++;
                    break;
                case ';':
                    semicolon++;
                    total++;
                    break;
                case ':':
                    colon++;
                    total++;
                    break;
                case '!':
                    exclamation++;
                    total++;
                    break;
                case '?':
                    question++;
                    total++;
                    break;
                case '-':
                    dash++;
                    total++;
                    break;
                case '\'':
                    quotes++;
                    total++;
                    break;
            }

        }
        look = "Period: " + period + "\ncomma: " + comma + "\nsemicolon: " + semicolon + "\ndash: " + dash +
                "\ncolon: " + colon + "\nexclamation: " + exclamation + "\nquestion: " + question +
                "\nquotes: " + quotes + "\ntotal: " + total;
        return look;
    }

    // Method to count numbers in text. Task 3
    public static String countNumbers(String text) {
        int count = 0;
        String look;
        Pattern p = Pattern.compile("\\b[\\d]+\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            count = count + Integer.parseInt(m.group());
        }
        look = "Sum of numbers in Text: " + count;
        return look;

    }

    // Method to count words. Task 6
    public static void countWords(String text) {
        String[] arrWords = text.split("\\b[\\W]+\\b");

        Map<String, Integer> words = new HashMap<String, Integer>();


        for (int i = 0; i < arrWords.length; i++) {
            String tempStr = arrWords[i];

            if (!words.containsKey(tempStr)) {
                words.put(tempStr, 1);
            } else {
                words.put(tempStr, words.get(tempStr) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Word = '" + entry.getKey() + "' used = " + entry.getValue() + " times");
        }

    }

    // Method count and compare letters. Task 7
    public static void countAndCompare(String text) {
        String[] procText = text.toLowerCase().split("[\\.\\!\\?]");
        int count = 0;
        for (int k = 0; k < procText.length; k++) {
            count++;
            System.out.println(countAndCompareInner(procText[k]) + " in " + count + " sentence");
        }
    }

        public static Boolean countAndCompareInner(String text){
            int countConsonants = 0;
            int countVowels = 0;
            char[] vowel = "aoieuy".toCharArray();
            char[] consonant = "bcdfghjklmnpqrstvwxz".toCharArray();
            char[] letter = text.toCharArray();

            for (int i = 0; i < letter.length; ++i) {
                for (int j = 0; j < consonant.length; j++) {
                    if (letter[i] == consonant[j])
                        countConsonants++;
                }
            }
            countVowels = letter.length - countConsonants;
            if (countConsonants < countVowels) {
                System.out.print("Vowels more than consonants");
            } else {
                System.out.print("Consonants more than vowels");
            }
            return true;

        }
    // Method to find sentence with "?". Task 8
    public static Boolean findQuestionLine (String text, int wordLength) {
        String questStr = "There is no text";
        Pattern p = Pattern.compile("[^\\.\\!\\?]*[\\?]");
        Matcher m = p.matcher(text);
        if (m.find()) {
           questStr = m.group();
        }

        String[] arrWords = questStr.split("\\b[\\W]+\\b");
        for (int i = 0; i < arrWords.length; i++) {
            if (arrWords[i].length() == wordLength)
            System.out.println(arrWords[i]);
        }
        return true;

    }

}

