package br.com.camel.ws;


import br.com.camel.model.Item;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService
public class ItemImp implements ItemWs{

    @Override
    public void mostrarItem(Item item) {
        System.out.println(item);
    }
}
