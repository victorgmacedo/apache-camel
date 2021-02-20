package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HttpGetConsumer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("timer:1000")
//                .routeId("GET")
//                .to("http://localhost:8080/api")
//                .log("${body}");
    }
}
