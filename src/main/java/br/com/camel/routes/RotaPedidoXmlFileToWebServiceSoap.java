package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaPedidoXmlFileToWebServiceSoap extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("file://pedidos?noop=true").
//                log("Camel trabalhando!!").
//                to("xj:identity?transformDirection=XML2JSON&output=file");
    }
}
