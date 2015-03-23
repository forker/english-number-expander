package com.inkglobal.numbers;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by @romansergey on 3/22/15.
 */
public class DictionaryTest {

    private ContextUnawareNumberDictionary dictionary = new SimpleNumberDictionary(new ByteArrayInputStream("1=one\n3=three".getBytes()));

    @Test
    public void checkKnownWord() {
        Assert.assertTrue(dictionary.isKnownWord(1));
    }

    @Test
    public void checkUnknownWord() {
        Assert.assertFalse(dictionary.isKnownWord(2));
    }

    @Test
    public void getWord() {
        Assert.assertEquals("one", dictionary.getWord(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getMissingWord() {
        Assert.assertEquals("nothing", dictionary.getWord(2));
    }

}
