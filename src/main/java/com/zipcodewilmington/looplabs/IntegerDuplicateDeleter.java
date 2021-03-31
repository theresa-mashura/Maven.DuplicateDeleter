package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int maxDupes) {

        // If max dupes are 0 or 1 then result array will be empty
        if (maxDupes == 0 || maxDupes == 1) {
            return new Integer[0];
        }

        // Purposely make an oversized array to hold everything we wanna keep
        Integer[] tempArr = new Integer[this.array.length];

        int countDupes = 1;
        Integer elem = array[0];
        int j = 0;
        for (int i = 1; i < this.array.length; i++) {
            if (array[i-1] == array[i]) {
                countDupes++;
                elem = array[i-1];
            }

            if (array[i - 1] != array[i] || i == array.length - 1) {
                // Put the stuff we want to keep in the temp array
                if (countDupes < maxDupes) {
                    int count = 0;
                    while(count < countDupes) {
                        tempArr[j] = elem;
                        j++;
                        count++;
                    }
                }
                countDupes = 1;
                elem = array[i];
            }
        }

        // Put stuff from temp into new array to get rid of nulls
        Integer[] result = new Integer[j];
        for(int i = 0; i < result.length; i++) {
            result[i] = tempArr[i];
        }

//        System.out.println(Arrays.deepToString(array));
//        System.out.println(Arrays.deepToString(tempArr));
//        System.out.println(Arrays.deepToString(result));

        return result;
    }

    public Integer[] removeDuplicatesExactly(int exactDupes) {

        // If max dupes are 0 or 1 then result array will be empty
        if (exactDupes == 0) {
            return new Integer[0];
        }

        // Purposely make an oversized array to hold everything we wanna keep
        Integer[] tempArr = new Integer[this.array.length];

        int countDupes = 1;
        Integer elem = array[0];
        int j = 0;
        for (int i = 1; i < this.array.length; i++) {
            if (array[i-1] == array[i]) {
                countDupes++;
                elem = array[i-1];
            }

            if (array[i - 1] != array[i] || i == array.length - 1) {
                // Put the stuff we want to keep in the temp array
                if (countDupes != exactDupes) {
                    int count = 0;
                    while(count < countDupes) {
                        tempArr[j] = elem;
                        j++;
                        count++;
                    }
                }
                countDupes = 1;
                elem = array[i];
            }
        }

        // Put stuff from temp into new array to get rid of nulls
        Integer[] result = new Integer[j];
        for(int i = 0; i < result.length; i++) {
            result[i] = tempArr[i];
        }

//        System.out.println(Arrays.deepToString(array));
//        System.out.println(Arrays.deepToString(tempArr));
//        System.out.println(Arrays.deepToString(result));

        return result;
    }
}
