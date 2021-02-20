package br.com.camel.routes;

import br.com.camel.exception.SocketException;
import br.com.camel.processor.SocketProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SocketConsumer extends RouteBuilder {

    @Autowired
    private Processor socketProcessor;

    @Override
    public void configure() throws Exception {
        onException(SocketException.class)
                .log("ERRO: ${body}");

        from("netty:tcp://127.0.0.1:4200?clientMode=true")
                .routeId("SOCKET")
                .log("${body}")
                .process(socketProcessor)
                .log("${body}");
    }
}
