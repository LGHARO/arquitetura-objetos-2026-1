package org.example;

import java.util.Collection;
import java.util.HashMap;

public class MedicoService {

    private HashMap<String, Medico> medicos = new HashMap<>();


    public boolean cadastrarMedico(String nome, String cpf) {
        if (medicos.containsKey(cpf)) {
            System.out.println("medico ja existe");
            return false;

        }

        if (nome == null || cpf == null ) {
            System.out.println("Dados inválidos");
            return false;
        }
        Medico medico = new Medico(nome, cpf, null);
        medicos.put(cpf, medico);

        return true;
    }
    public Collection<Medico> listarMedicos() {
        for (Medico medico: medicos.values()) {
            medico.imprime();
        }
        return medicos.values();
    }

    public Medico buscarMedico(String cpf) {
        return medicos.get(cpf);
    }
}
