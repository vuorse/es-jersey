
package com.houstoninc.esj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BarMatchingAnswerMatcherTest {
    private AnswerMatcher am;

    @Before
    public void setup() {
        am = new AnswerMatcher(".*-(bar)*", new Answer() {
            @Override
            public String get(String... params) {
                return params[1];
            }
        });
    }

    @Test
    public void canMatchAString() {
        assertTrue(am.matches("foo-bar"));
    }

    @Test
    public void returnsBar() {
        assertEquals("bar", am.answer("foo-bar"));
    }

}