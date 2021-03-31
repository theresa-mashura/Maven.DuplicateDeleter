package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T extends Comparable<T>> implements DuplicateDeleterInterface<T>{
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    /* // Realized too late this is unnecessary...oh well...
    public T[] sortArray() {

        // Selection sort >=D
        for (int i = 0; i < this.array.length; i++) {
            // Start by assuming 1st element in unsorted section is the min
            T min = array[i];
            int pos = i;

            // Iterate through the rest of unsorted section to see if there is a item smaller than assumed min
            for (int j = i + 1; j < this.array.length; j++) {
                if(array[j].compareTo(min) < 0) {
                    min = array[j];
                    pos = j;
                }
            }
            // Move new min (if there is one) to end of the sorted section
            T temp = array[i];
            array[i] = min;
            array[pos] = temp;
        }
        return this.array;
    }
     */

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}
