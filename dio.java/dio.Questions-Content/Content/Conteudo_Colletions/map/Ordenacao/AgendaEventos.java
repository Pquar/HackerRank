package Colletions.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        //localdate implements chrnoLocalDate que implementa o comparable que sabe como fazer a ordem cresecente.
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        //Set<LocalDate, Evento> dataset = eventoMap.keySet(); retorna todas as chaves
        //Collections<Evento> values = eventoMap.values(); Retorna todos os valores
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(entry.getKey()) || entry.getKey().isAfter(dataAtual)) {
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximoEvento + " | Data: " + proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023,Month.JULY,15),"Evento1", "Atrcacao1");
        agendaEventos.adicionarEvento(LocalDate.of(2023,Month.MAY,15),"Evento2", "Atrcacao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.FEBRUARY,15),"Evento3", "Atrcacao3");
        agendaEventos.adicionarEvento(LocalDate.of(2023,Month.AUGUST,25),"Evento3", "Atrcacao3");
        agendaEventos.exibirAgenda();

        System.out.println();
        agendaEventos.obterProximoEvento();
    }
}
