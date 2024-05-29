import static org.junit.Assert.*;

import org.example.BeFriends;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class WhiteBoxTesting {

    @Test
    public void testInsertCowInMiddle() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1, 4, 2, 3));

        BeFriends.InsertCow(input, 0);

        assertEquals(expectedOutput, input);
    }

    @Test
    public void testInsertCowAtBeginning() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 3, 1));
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 4, 3, 1));

        BeFriends.InsertCow(input, 0);

        assertEquals(expectedOutput, input);
    }

    @Test
    public void testInsertCowAtEnd() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        BeFriends.InsertCow(input, 2);

        assertEquals(expectedOutput, input);
    }

    @Test
    public void testInsertCowInSingleElementList() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1, 4));

        BeFriends.InsertCow(input, 0);

        assertEquals(expectedOutput, input);
    }

    @Test
    public void testInsertCowInEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(4));

        BeFriends.InsertCow(input, 0);

        assertEquals(expectedOutput, input);
    }
}

