package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    private TwoNumbersSum test;

    ArrayList<Integer> threeDigit1 = new ArrayList<Integer>();
    ArrayList<Integer> threeDigit2 = new ArrayList<Integer>();
    ArrayList<Integer> threeDigit3 = new ArrayList<Integer>();
    ArrayList<Integer> fourDigit1 = new ArrayList<Integer>();
    ArrayList<Integer> fourDigit2 = new ArrayList<Integer>();


    @BeforeEach
    public void initialise() {

        this.test = new TwoNumbersSum();

        threeDigit1.add(3);
        threeDigit1.add(4);
        threeDigit1.add(9);

        threeDigit2.add(5);
        threeDigit2.add(7);
        threeDigit2.add(1);

        threeDigit3.add(9);
        threeDigit3.add(2);
        threeDigit3.add(0);

        fourDigit1.add(8);
        fourDigit1.add(1);
        fourDigit1.add(1);
        fourDigit1.add(1);

        fourDigit2.add(9);
        fourDigit2.add(9);
        fourDigit2.add(9);
        fourDigit2.add(9);
    }

    @Test
    public void twoThreeDigits() {

        Assertions.assertEquals(threeDigit3, test.addTwoNumbers(threeDigit1,threeDigit2));
    }

    @Test
    public void twoThreeDigitsEqualsFourDigits() {

        ArrayList<Integer> answer = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(6);
            add(9);
        }};

        Assertions.assertEquals(answer, test.addTwoNumbers(threeDigit1,threeDigit3));
    }

    @Test
    public void fourDigitAddThreeDigitEqualsFourDigits() {

        ArrayList<Integer> answer = new ArrayList<Integer>(){{
            add(8);
            add(4);
            add(6);
            add(0);
        }};

        Assertions.assertEquals(answer, test.addTwoNumbers(threeDigit1, fourDigit1));
    }

    @Test
    public void fourDigitAddThreeDigitEqualsFiveDigits() {

        ArrayList<Integer> answer = new ArrayList<Integer>(){{
            add(1);
            add(0);
            add(9);
            add(1);
            add(9);
        }};

        Assertions.assertEquals(answer, test.addTwoNumbers(threeDigit3, fourDigit2));
    }

}
