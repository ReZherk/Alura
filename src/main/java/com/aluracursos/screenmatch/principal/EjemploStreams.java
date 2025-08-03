package com.aluracursos.screenmatch.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres= Arrays.asList("Patrick","Daira","Mateo","Enzo","Juan");
        nombres.stream().sorted().filter(n->n.startsWith("P")).map(n->n.toUpperCase()).limit(4).forEach(System.out::println);
    }
}
