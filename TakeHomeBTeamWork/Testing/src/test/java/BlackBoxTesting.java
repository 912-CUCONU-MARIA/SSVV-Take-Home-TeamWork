import org.example.BeFriends;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BlackBoxTesting {

    @Test
    public void testFindPair_ValidMouseCatPair() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(2);
        animals.add(3);
        animals.add(4);
        Assertions.assertNotEquals(-1, BeFriends.FindPair(animals, 0));
    }

    @Test
    public void testFindPair_ValidCatDogPair() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(2);
        animals.add(3);
        animals.add(4);
        Assertions.assertNotEquals(-1, BeFriends.FindPair(animals, 1));
    }

    @Test
    public void testFindPair_InvalidPairs() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1); //mouse
        animals.add(3); //dog
        animals.add(4); //cow
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0)); // mouse-dog
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 2)); // dog-cow
    }

    @Test
    public void testFindPair_InvalidAnimals() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(10);
        animals.add(11);
        animals.add(12);
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0));
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 2));
    }

    @Test
    public void testFindPair_OutOfBounds() {
        ArrayList<Integer> animals = new ArrayList<>();
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0));
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 1));
    }

    @Test
    public void testFindPair_ArrayLengthOne() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0));
    }

    @Test
    public void testFindPair_ArrayLengthTwo() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(1);
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0));
    }

    @Test
    public void testFindPair_NoPairs() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(4);
        Assertions.assertEquals(-1, BeFriends.FindPair(animals, 0));
    }

    @Test
    public void testFindPair_OnePair() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(2);
        Assertions.assertNotEquals(-1, BeFriends.FindPair(animals, 0));
    }

    @Test
    public void testFindPair_TwoPairs() {
        ArrayList<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(2);
        animals.add(1);
        Assertions.assertNotEquals(-1, BeFriends.FindPair(animals, 0));
        Assertions.assertNotEquals(-1, BeFriends.FindPair(animals, 1));
    }

}
