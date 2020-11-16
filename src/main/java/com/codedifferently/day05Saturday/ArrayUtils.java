package com.codedifferently.day05Saturday;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;

        for (Object number : objectArray) {
            if (number == objectToCount)
                count++;
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] newObjectArray = null;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToRemove) {
                objectArray = ArrayUtils.remove(objectArray, i);
            }
        }
        return objectArray;
    }

    private static Object[] remove(Object[] objectArray, int i) {
        Object[] newObjectArray = null;

        for(i = 0; i < objectArray.length; i++) {
            newObjectArray = new Object[objectArray.length - 1];

            for(int index = 0; index < i; index++) {
                newObjectArray[index] = objectArray[index];
            }
            for(int j = i; j < objectArray.length - 1; j++) {
                newObjectArray[j] = objectArray[j + 1];
            }
        }
        return newObjectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);

        int max_count = 1;
        Object result = objectArray[0];
        int curr_count = 1;
        int n = objectArray.length;

        for(int i = 1; i < objectArray.length; i++) {
            if(objectArray[i] == objectArray[i - 1])
                curr_count++;
            else {
                if(curr_count > max_count) {
                    max_count = curr_count;
                    result = objectArray[i - 1];
                }
                curr_count = 1;
            }
        }

        if(curr_count > max_count) {
            max_count = curr_count;
            result = objectArray[n - 1];
        }

        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Arrays.sort(objectArray);

        int min_count = objectArray.length + 1;
        Object result = -1;
        int curr_count = 1;
        int n = objectArray.length;

        for(int i = 1; i < objectArray.length; i++) {
            if(objectArray[i] == objectArray[i - 1])
                curr_count++;
            else {
                if(curr_count < min_count) {
                    min_count = curr_count;
                    result = objectArray[i - 1];
                }
                curr_count = 1;
            }
        }

        if(curr_count < min_count) {
            min_count = curr_count;
            result = objectArray[n - 1];
        }

        return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int a1 = objectArray.length;
        int b1 = objectArrayToAdd.length;
        int c1 = a1 + b1;
        Object[] c = new Object[c1];

        System.arraycopy(objectArray, 0, c, 0,a1);
        System.arraycopy(objectArrayToAdd, 0, c, a1, b1);

        return c;
    }
}
