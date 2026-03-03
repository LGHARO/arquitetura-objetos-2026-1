package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Medico {
    private String nome;
    private String cpf;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Medico(String nome, String cpf, Consulta consulta) {
        this.nome = nome;
        this.cpf = cpf;
        consultas.add(consulta);

    }

    public void imprime() {

        System.out.println("### Medico ###");
        System.out.format("Nome %s", nome);
        System.out.format("CPF: %s\n", cpf);
    }
}
