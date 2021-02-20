package br.com.camel.controller;

import br.com.camel.routes.SocketConsumer;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("api")
public class ItemController {

    @Autowired
    private SocketConsumer socketConsumer;

    @GetMapping
    public String test() throws Exception {
        DefaultCamelContext defaultCamelContext = new DefaultCamelContext();
        defaultCamelContext.addRoutes(socketConsumer);
        defaultCamelContext.start();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        ServerSocket socket = new ServerSocket(4200);
        Socket client = socket.accept();
        for (int i = 0; i < 1500; i++) {
            client.getOutputStream().write(simpleDateFormat.format(new Date()).getBytes());
        }
        return "Uma string qualquer";
    }

    public void testeSocket(String socket){
        System.out.println(socket);
    }

}
