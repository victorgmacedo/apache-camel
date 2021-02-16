package br.com.caelum.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaPedidos {

	public static void main(String[] args) throws Exception {

//		CamelContext context = new DefaultCamelContext();
//		context.addRoutes(new RouteBuilder() {
//
//			  @Override
//			  public void configure() throws Exception {
//				  from("file:pedidos?noop=true"). //aqui tem um ponto para encadear a chamada do próximo método
//						  log("Camel trabalhando!!").
//						  setHeader(Exchange.FILE_NAME, simple("${id}-${file:name.noext.single}.json")).
//						  marshal().xmljson().
//						  to("file:saida");
//			  }
//		  }
//		);
//
//		context.start(); //aqui camel realmente começa a trabalhar
//		Thread.sleep(5000);//esperando um pouco para dar um tempo para camel
//		context.stop();

	}	
}
