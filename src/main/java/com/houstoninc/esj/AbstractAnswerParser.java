
package com.houstoninc.esj;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractAnswerParser {
    List<AnswerMatcher> matchers = new ArrayList<AnswerMatcher>();

    public String getAnswer(String question) {
        for (AnswerMatcher m: matchers) {
            if (m.matches(question)) {
                return m.answer(question);
            }
        }
        System.out.println("[WARN] Unable to find answer for: " + question);
        return null;
    }

    protected void match(String pattern, Answer answer) {
        matchers.add(new AnswerMatcher(pattern, answer));
    }

}
