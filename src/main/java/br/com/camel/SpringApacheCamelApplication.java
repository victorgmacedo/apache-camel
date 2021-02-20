package br.com.camel;

import br.com.camel.ws.ItemImp;
import br.com.camel.ws.ItemWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.xml.ws.Endpoint;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringApacheCamelApplication {

	@Autowired
	ItemWs ws;

	public static void main(String[] args) {
		SpringApplication.run(SpringApacheCamelApplication.class, args);
	}

}
