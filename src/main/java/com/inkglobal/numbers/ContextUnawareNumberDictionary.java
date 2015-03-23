package com.inkglobal.numbers;

/**
 * Created by @romansergey on 3/22/15.
 */
public interface ContextUnawareNumberDictionary {
    String getWord(int num);

    boolean isKnownWord(int num);
}
