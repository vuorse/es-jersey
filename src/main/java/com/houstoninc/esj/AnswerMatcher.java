
package com.houstoninc.esj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AnswerMatcher {
    private Pattern p;
    private Answer a;

    public AnswerMatcher(String pattern, Answer answer) {
        p = Pattern.compile(pattern);
        a = answer;
    }

    public boolean matches(String question) {
        return p.matcher(question).matches();
    }

    public String answer(String question) {
        String[] params = extractGroups(question);
        return a.get(params);
    }

    String[] extractGroups(String question) {
        Matcher m = p.matcher(question);
        m.find();
        int count = m.groupCount();
        String[] arr = new String[count + 1];
        for (int i = 0; i <= count; i++) {
            arr[i] = m.group(i);
        }
        return arr;
    }
}
