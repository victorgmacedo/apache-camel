package br.com.camel.model;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "item")
@ToString
public class Item {
    private String formato;
    private String quantidade;
    private Livro livro;
}
