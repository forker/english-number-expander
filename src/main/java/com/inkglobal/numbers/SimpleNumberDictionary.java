package com.inkglobal.numbers;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by @romansergey on 3/22/15.
 */
public class SimpleNumberDictionary implements ContextUnawareNumberDictionary {

    private Map<Integer, String> baseDictionary = new HashMap<Integer, String>();

    public SimpleNumberDictionary(InputStream is) {
        load(is);
    }

    @Override
    public String getWord(int num) {
        if(baseDictionary.containsKey(num)) {
            return baseDictionary.get(num);
        } else {
            throw new UnsupportedOperationException("No entry in the dictionary for: " + num);
        }
    }

    @Override
    public boolean isKnownWord(int num) {
        return baseDictionary.containsKey(num);
    }

    private void load(InputStream is) {
        Properties prop = new Properties();

        try {
            prop.load(is);
        } catch (IOException e) {
            //Unable to proceed whatsoever, not expecting anyone to handle this
            throw new RuntimeException(e);
        }

        for(Map.Entry<Object, Object> e : prop.entrySet()) {
            baseDictionary.put(
                    Integer.parseInt((String) e.getKey()),
                    (String )e.getValue()
            );
        }
    }

}
