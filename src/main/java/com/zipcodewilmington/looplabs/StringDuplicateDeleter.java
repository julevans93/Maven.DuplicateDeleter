package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] array;

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.array = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(word -> countDuplicates(word) < maxNumberOfDuplications).toArray(String[] :: new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(word -> countDuplicates(word) != exactNumberOfDuplications).toArray(String[] :: new);
    }

    public Long countDuplicates(String word){
        return Arrays.stream(array).filter(n -> n == word).count();
    }
}
