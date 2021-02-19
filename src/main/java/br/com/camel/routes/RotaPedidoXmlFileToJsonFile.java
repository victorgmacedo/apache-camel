package br.com.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class RotaPedidoXmlFileToJsonFile extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("file://pedidos?noop=true").
//                split(xpath("/pedido/itens/item")).
//                filter(xpath("/item/formato/text()='EBOOK'")).
//        log("Camel trabalhando!! ${body}").
//        setHeader(Exchange.XSLT_FILE_NAME, simple("saida\\${id}-${file:name.noext.single}.json")).
//        to("xj:identity?transformDirection=XML2JSON&output=file");
    }
}
