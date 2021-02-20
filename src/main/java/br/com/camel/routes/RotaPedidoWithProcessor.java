package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

@Component
public class RotaPedidoWithProcessor extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        Processor processor = new Processor() {
//            @Override
//            public void process(Exchange exchange) throws Exception {
//                System.out.println(exchange.getIn().getBody(String.class));
//                exchange.getIn().setBody("Body convertido");
//            }
//        };
//
//        from("file://pedidos?noop=true").process(processor).log("${body}");
    }
}
