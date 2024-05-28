package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Collections.addAll(input, 1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1);
        System.out.println(BeFriends.BeFriends(input));
    }
}