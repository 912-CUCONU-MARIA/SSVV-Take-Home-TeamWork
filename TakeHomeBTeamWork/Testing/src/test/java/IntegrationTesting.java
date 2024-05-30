import org.example.BeFriends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegrationTesting {

    @Test
    public void testGivenExample() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 2, 4, 3, 4, 3, 4, 2, 4, 1, 1, 4, 2, 4, 3, 1));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMouseCatPair() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 2));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCatDogPair() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 3));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoPairs() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 3, 3, 1, 1, 1, 4, 4, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 3, 3, 1, 1, 1, 4, 4, 4));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplePairs() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 4, 2, 3, 2, 3, 2));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 2, 4, 1, 4, 2, 4, 1, 4, 2, 4, 3, 4, 2, 4, 3, 4, 2));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSingleElement() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1));

        ArrayList<Integer> actual = BeFriends.BeFriends(input);

        Assertions.assertEquals(expected, actual);
    }
}