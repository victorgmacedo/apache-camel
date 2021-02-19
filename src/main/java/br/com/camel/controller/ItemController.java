package br.com.camel.controller;

import br.com.camel.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ItemController {

    @PostMapping
    public ResponseEntity<?> soutItem(@RequestBody Item item){
        System.out.println(item);
        return ResponseEntity.ok().build();
    }

}
