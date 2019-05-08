package com.example.h2demo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/4/16.
 *
 * @author liweijian.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

//        System.out.println(filtered);
    }
}
