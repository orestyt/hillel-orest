package main.homework6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        final Random random = new Random();
        int randIndex = random.nextInt(24);
//        String correctWord = "apple";
        String correctWord = words[randIndex];
        String usersWord = typeInWord();
        while (!checkIfCorrectWord(correctWord, usersWord)) {
            usersWord = typeInWord();
        }
    }

    public int findSymbolOccurance(String str, char symbol) {
        int sum = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == symbol) sum++;
        }
        return sum;
    }

    public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public String stringReverse(String str) {
        String newstr = "";
        char chr;
        for (int i = 0; i < str.toCharArray().length; i++) {
            chr = str.toCharArray()[i];
            newstr = chr + newstr;
        }
        return newstr;
    }

    public boolean isPalindrome(String str) {
        return stringReverse(str).equals(str);
    }

    public static String typeInWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a word");
        return scanner.nextLine();
    }

    public static boolean checkIfCorrectWord(String source, String target) {

        if (source.equals(target)) return true;
        else {
            System.out.println(helpWithWord(source, target));
            System.out.println(" ");
            return false;
        }
    }

    public static String helpWithWord(String source, String target){
        char[] sourceChar = source.toCharArray();
        char[] targetChar = target.toCharArray();
        char[] resultChar = new char[15];
        for (int i = 0; i < 15; ) {
            while (i < sourceChar.length && i < targetChar.length) {
                if (sourceChar[i] == targetChar[i]) {
                    resultChar[i] = sourceChar[i];
                    i++;
                } else {
                    resultChar[i] = '#';
                    i++;
                }
            }
            resultChar[i]='#';
            i++;
        }
        return String.copyValueOf(resultChar);
    }
}
