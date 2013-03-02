
package com.houstoninc.esj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ExtremeAnswerParserTest {

    private ExtremeAnswerParser parser;

    @Before
    public void createParser() {
        parser = new ExtremeAnswerParser();
    }

    @Test
    public void canAnswerSantasRealName() {
        String a = parser.getAnswer("What's santa clause's real name");
        assertEquals("Kris Kringle", a);
    }

    @Test
    public void canDoSums() {
        String a = parser.getAnswer("The sum of 12 and 5");
        assertEquals("17", a);
    }

    @Test
    public void canDoSums2() {
        String a = parser.getAnswer("682aa390: what is 9 plus 8");
        assertEquals("17", a);
    }

    @Test
    public void canDoMultiply() {
        String a = parser.getAnswer("ce789500: what is 17 multiplied by 17");
        assertEquals("289", a);
    }

}