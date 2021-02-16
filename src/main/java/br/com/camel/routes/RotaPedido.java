package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class RotaPedido extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://pedidos?noop=true"). //aqui tem um ponto para encadear a chamada do próximo método
                log("Camel trabalhando!!").
                setHeader(Exchange.XSLT_FILE_NAME, simple("saida\\${id}-${file:name.noext.single}.json")).
                to("xj:identity?transformDirection=XML2JSON&output=file");
    }
}
