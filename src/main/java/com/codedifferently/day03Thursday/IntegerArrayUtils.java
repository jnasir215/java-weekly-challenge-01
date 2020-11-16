package com.codedifferently.day03Thursday;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int i;
        int sum = 0;

        for(i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int i;
        int product = 1;

        for(i = 0; i < intArray.length; i++) {
            product = product * intArray[i];
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int i;
        int sum = 0;
        double average;

        for(i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        average = sum/intArray.length;
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int i;
        int largest = 0;

        for(i = 0; i < intArray.length; i++) {
            if(intArray[i] > largest)
                largest = intArray[i];
            else largest = largest;
            }
        return largest;
    }
}
