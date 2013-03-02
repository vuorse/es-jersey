package com.houstoninc.esj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class AnswerResource {

    private ExtremeAnswerParser parser = new ExtremeAnswerParser();

    @GET
    @Produces("text/plain")
    public String getAnswer(@QueryParam("q") String question) {
        return parser.getAnswer(question);
    }
}
