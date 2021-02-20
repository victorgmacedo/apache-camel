package br.com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.net.SocketException;

@Component
public class SocketProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        if(exchange.getIn().getBody(String.class).equals("ERRO")){
            throw new SocketException("Mensagem com erro");
        }
        exchange.getIn().setBody("Mensagem recebida e processada");
    }
}
