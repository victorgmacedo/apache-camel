package br.com.camel.routes;

import br.com.camel.model.Item;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;

@Component
public class RotaPedidoXmlFileToJsonHttpPost extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        JacksonDataFormat jacksonDataFormat = new JacksonDataFormat();
        jacksonDataFormat.setPrettyPrint(true);
        from("file://pedidos?noop=true").
                log("Lendo Arquivo XML ${file:name}").
                split(xpath("/pedido/itens/item")).
                log("Filtrando arquivos EBOOK").
                filter(xpath("/item/formato/text()='EBOOK'")).
                log("Convertendo para JSON").
                unmarshal(new JaxbDataFormat(JAXBContext.newInstance(Item.class))).
                marshal(jacksonDataFormat).
                log("Enviando request post to http://localhost:8080/api").
                to("http://localhost:8080/api");
    }
}
