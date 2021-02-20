package br.com.camel.model;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@XmlRootElement
public class Item {

    private String formato;
    private String quantidade;
    private Livro livro;
}
