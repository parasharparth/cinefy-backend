package com.cinefy.backend.conversions;
import java.util.*;

public class ArrayToListConversion {

    //converting an array to list (will be used by the database returning objects (single dimension array)
    public static List<Integer> integerconversion(int[] array)
    {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(array).boxed().toArray(Integer[]::new));
        return list;
    }

    public static List<Long> longconversion(long[] array)
    {
        List<Long> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(array).boxed().toArray(Long[]::new));
        return list;
    }

    public static List<String> stringConversion(String[] array)
    {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.forEach(x -> System.out.println(x));
        return list;
    }

}
