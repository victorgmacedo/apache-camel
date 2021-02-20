package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class RotaPedidoConvertXmlToJson extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("file://pedidos?noop=true").
////                multicast(). Caso não queira que o Body seja alterado entre um direct e outro
//                routeId("Rota Inicial").
//                to("direct:tojson").
//                to("direct:logjson");
//
//        from("direct:tojson").
//                routeId("Rota XML").
//                log("XML: ${body}").
//                to("xj:identity?transformDirection=XML2JSON&output=string");
//
//        from("direct:logjson").
//                routeId("Rota JSON").
//                log("JSON: ${body}");
    }
}
