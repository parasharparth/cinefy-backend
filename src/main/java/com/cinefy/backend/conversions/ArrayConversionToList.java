package com.cinefy.backend.conversions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConversionToList {

    public static List<List<Integer>> integerArrayListConversion(int[][] array)
    {
        return Arrays.
                    //Convert the 2d array into a stream.
                            stream(array).
                    //Map each 1d array (internalArray) in 2d array to a List.
                            map(
                            //Stream all the elements of each 1d array and put them into a list of Integer.
                            internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                            )
                            //Put all the lists from the previous step into one big list.
                    ).collect(Collectors.toList());
    }

    public static List<List<Long>> integerArrayListConversion(long[][] array)
    {
        return Arrays.
                //Convert the 2d array into a stream.
                        stream(array).
                //Map each 1d array (internalArray) in 2d array to a List.
                        map(
                        //Stream all the elements of each 1d array and put them into a list of Integer.
                        internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                        )
                        //Put all the lists from the previous step into one big list.
                ).collect(Collectors.toList());
    }
}
