package com.inkglobal.numbers;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by @romansergey on 3/22/15.
 */
public class EnglishExpansionTest {

    private NumberExpander englishExpander = new EnglishNumberExpander();

    private void testNumber(int num, String expanded) {
        Assert.assertEquals(expanded, englishExpander.expand(num));
    }

    @Test
    public void number1() {
        testNumber(1, "one");
    }

    @Test
    public void number2() {
        testNumber(2, "two");
    }

    @Test
    public void number3() {
        testNumber(3, "three");
    }

    @Test
    public void number4() {
        testNumber(4, "four");
    }

    @Test
    public void number5() {
        testNumber(5, "five");
    }

    @Test
    public void number19() {
        testNumber(19, "nineteen");
    }

    @Test
    public void number20() {
        testNumber(20, "twenty");
    }

    @Test
    public void number100() {
        testNumber(100, "one hundred");
    }

    @Test
    public void number1000() {
        testNumber(1000, "one thousand");
    }

    @Test
    public void number21() {
        testNumber(21, "twenty one");
    }

    @Test
    public void number22() {
        testNumber(22, "twenty two");
    }

    @Test
    public void number33() {
        testNumber(33, "thirty three");
    }

    @Test
    public void number46() {
        testNumber(46, "forty six");
    }

    @Test
    public void number101() {
        testNumber(105, "one hundred and five");
    }

    @Test
    public void number162() {
        testNumber(162, "one hundred and sixty two");
    }

    @Test
    public void number199() {
        testNumber(199, "one hundred and ninety nine");
    }

    @Test
    public void number201() {
        testNumber(201, "two hundred and one");
    }


    @Test
    public void number213() {
        testNumber(213, "two hundred and thirteen");
    }

    @Test
    public void number991() {
        testNumber(991, "nine hundred and ninety one");
    }

    @Test
    public void number980() {
        testNumber(980, "nine hundred and eighty");
    }


    @Test
    public void number1001() {
        testNumber(1001, "one thousand and one");
    }

    @Test
    public void number1050() {
        testNumber(1050, "one thousand and fifty");
    }

    @Test
    public void number1123() {
        testNumber(1123, "one thousand one hundred and twenty three");
    }

    @Test
    public void number1505() {
        testNumber(1505, "one thousand five hundred and five");
    }

    @Test
    public void number3011() {
        testNumber(3011, "three thousand and eleven");
    }

    @Test
    public void number10001() {
        testNumber(10001, "ten thousand and one");
    }

    @Test
    public void number10000() {
        testNumber(10000, "ten thousand");
    }

    @Test
    public void number10101() {
        testNumber(10101, "ten thousand one hundred and one");
    }

    @Test
    public void number19019() {
        testNumber(19019, "nineteen thousand and nineteen");
    }

    @Test
    public void number99999() {
        testNumber(99999, "ninety nine thousand nine hundred and ninety nine");
    }

    @Test
    public void number100001() {
        testNumber(100001, "one hundred thousand and one");
    }

    @Test
    public void number100501() {
        testNumber(100501, "one hundred thousand five hundred and one");
    }

    @Test
    public void number902105() {
        testNumber(902105, "nine hundred and two thousand one hundred and five");
    }

    @Test
    public void number1000000() {
        testNumber(1000000, "one million");
    }

    @Test
    public void number1230000() {
        testNumber(1230000, "one million two hundred and thirty thousand");
    }

    @Test
    public void number56945781() {
        testNumber(56945781, "fifty six million nine hundred and forty five thousand seven hundred and eighty one");
    }

    @Test
    public void number999999999() {
        testNumber(999999999, "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
    }

    @Test
    public void number100000000() {
        testNumber(100000000, "one hundred million");
    }

    @Test
    public void number10000015() {
        testNumber(100000015, "one hundred million and fifteen");
    }


    @Test(expected = UnsupportedOperationException.class)
    public void number1000000000() {
        testNumber(1000000000, "whatever");
    }

}
