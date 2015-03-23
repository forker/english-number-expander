package com.inkglobal.numbers;

/**
 * Created by @romansergey on 3/22/15.
 */
public class EnglishNumberExpander implements NumberExpander {

    public ContextUnawareNumberDictionary dictionary = new SimpleNumberDictionary(getClass().getResourceAsStream("/dict.properties"));

    @Override
    public String expand(int i) {
        if(dictionary.isKnownWord(i) && i < 100) {
            return dictionary.getWord(i);
        } else {
            StringBuilder expansion = new StringBuilder();
            int order = Integer.toString(i).length() - 1;

            if(order > 3) {
                order = order - order % 3;
            }

            int base = baseOfOrder(order);

            if(base > 10) {
                expansion.append(expand(i / base) + ' ');
                expansion.append(dictionary.getWord(base));
            } else {
                expansion.append(dictionary.getWord(i - i % base));
            }

            if(i % base > 0) {
                expansion.append(' ');

                if(base != 10 && i % base < 100) {
                    expansion.append("and ");
                }

                expansion.append(
                        expand(i % base)       //recurse!
                );
            }

            return expansion.toString();
        }
    }

    public int baseOfOrder(int order) {
        int result = 1;
        while(order-- > 0) {
            result *= 10;
        }
        return result;
    }

}
