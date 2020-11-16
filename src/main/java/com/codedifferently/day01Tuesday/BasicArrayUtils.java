package com.codedifferently.day01Tuesday;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] reverseArray = new String[stringArray.length];
        int i;  //counter for stringArray
        int j = 0;  //counter for reverseArray

        for(i = stringArray.length-1; i >= 0; i--) {
            reverseArray[j] = stringArray[i];
            j++;
        }
        return reverseArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String firstLetters = "";
        int i;

        for(i = 0; i < stringArray.length; i++) {
            firstLetters += stringArray[i].charAt(0);
        }
        return firstLetters;
    }
}
