
package com.houstoninc.esj;

public class ExtremeAnswerParser extends AbstractAnswerParser {

    public ExtremeAnswerParser() {
        match("What's santa clause's real name", new Answer() {
            @Override
            public String get(String... params) {
                return "Kris Kringle";
            }
        });

        match("The sum of (\\d+) and (\\d+)", new Answer() {
            @Override
            public String get(String... params) {
                return new Integer(Integer.parseInt(params[1]) + Integer.parseInt(params[2])).toString();
            }
        });

        match("\\w+: what is (\\d+) plus (\\d+)", new Answer() {
            @Override
            public String get(String... params) {
                return new Integer(Integer.parseInt(params[1]) + Integer.parseInt(params[2])).toString();
            }
        });

        match("\\w+: what is (\\d+) multiplied by (\\d+)", new Answer() {
            @Override
            public String get(String... params) {
                return new Integer(Integer.parseInt(params[1]) * Integer.parseInt(params[2])).toString();
            }
        });
        
    }

}
