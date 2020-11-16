package com.codedifferently.day02Wednesday;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] text = str.split("\\s");
        StringBuilder sBuild = new StringBuilder();

        for(String ch: text) {
            if(!ch.equals("")) {
                sBuild.append(Character.toUpperCase(ch.charAt(0)));
                sBuild.append(ch.substring(1));
            }
            sBuild.append(" ");
        }
        return sBuild.toString().trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for(int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        int i;
        int j;

        for(i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for(j = word.length()-1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }
        return reversedString.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder sBuild = new StringBuilder(str);

        sBuild.deleteCharAt(str.length()-1);
        sBuild.deleteCharAt(0);

        return sBuild.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        int i;

        for(i = 0; i < chars.length; i++) {
            char l = chars[i];

            if(Character.isUpperCase(l)) {
                chars[i] = Character.toLowerCase(l);
            }
            else if (Character.isLowerCase(l)) {
                chars[i] = Character.toUpperCase(l);
            }
        }
        return new String(chars);
    }
}
