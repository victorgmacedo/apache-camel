package br.com.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaPedidoXmlActiveMq extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:queue:pedidos").
        log(" ${body}");
    }
}
