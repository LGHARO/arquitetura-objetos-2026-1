package org.example;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class ConsultaService {
    private HashMap<String, Consulta> consultas = new HashMap<>();

    public boolean cadastrarConsulta(Paciente paciente, Medico medico){
        if (paciente != null) {
            Consulta consulta = new Consulta();
            consulta.setPaciente(paciente);
            consulta.setMedico(medico);
            consulta.setData(LocalDateTime.now().plusDays(5));
            consulta.setId(UUID.randomUUID().toString());
            consultas.put(consulta.getId(), consulta);
            System.out.println("Consulta cadastrada com sucesso");
            return true;
        }
        return false;
    }

    public Collection<Consulta> listaConsultas() {
        for (Consulta consulta: consultas.values()) {
            consulta.imprime();
        }
        return consultas.values();
    }
}
