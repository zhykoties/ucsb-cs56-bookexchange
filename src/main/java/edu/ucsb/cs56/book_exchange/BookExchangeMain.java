package edu.ucsb.cs56.book_exchange;

import static spark.Spark.port;

import org.apache.log4j.Logger;


import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Simple example of using Mustache Templates
 *
 */

public class BookExchangeMain {

	public static final String CLASSNAME="BookExchangeMain";

	public static final Logger log = Logger.getLogger(CLASSNAME);

	public static void main(String[] args) {

        port(getHerokuAssignedPort());

		Map map = new HashMap();
        map.put("name", "Sam");

        // hello.mustache file is in resources/templates directory
        get("/", (rq, rs) -> new ModelAndView(map, "hello.mustache"), new MustacheTemplateEngine());
        get("/about", (rq, rs) -> new ModelAndView(map, "about.mustache"), new MustacheTemplateEngine());
        get("/listings", (rq, rs) -> new ModelAndView(map, "listings.mustache"), new MustacheTemplateEngine());

	}

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


}
