package org.example;

import java.util.ArrayList;

public class BeFriends {
    /**
     * Make sure that no dogs are next to cats and no cats are next to mice
     * @param input the list representing the order of the animals
     * @return a list with added cows to mollify the situation
     */
    public static ArrayList<Integer> BeFriends(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>(input);

        int idx = 0;
        while(true) {
            idx = FindPair(output, idx);
            // if no more inserts are needed
            if(idx == -1)
                break;
            // if there was a find, insert a cow after the first element of the pair
            InsertCow(output, idx);
        }

        return output;
    }

    /**
     * Find a pair of animals that need to be separated.
     * @param input the list in which to search
     * @param idx the index where to start the search from
     * @return the index of the first element of a pair of animals that need to be separated
     */
    public static int FindPair(ArrayList<Integer> input, int idx) {
        for(int i = idx; i < input.size() - 1; i++) {
            if(
                // if there's a cat, see if it's next to a mouse or a cat
                    (input.get(i) == 2 && (input.get(i + 1) == 1 ||  input.get(i + 1) == 3)) ||
                            // if there's a mouse, see if it is next to a cat
                            (input.get(i) == 1 && input.get(i + 1) == 2) ||
                            // if there's a dog, see if it is next to a cat
                            (input.get(i) == 3 && input.get(i + 1) == 2))
            {
                return i;
            }
        }
        // no more pairs found
        return -1;
    }

    /**
     * Insert a cow after index
     * @param input the list into which to insert
     * @param idx the first element of the pair of animals that need to be separated
     */
    public static void InsertCow(ArrayList<Integer> input, int idx) {
        // add a cow right after index
        input.add(idx + 1, 4);
    }
}
