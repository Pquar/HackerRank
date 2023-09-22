package clon.patterns.clon.service;

import clon.patterns.clon.model.Client;

public interface ClientService {
    Iterable<Client> buscarTodos();
    Client buscarPorId(Long id);
    void inserir(Client client);
    void atualizar(Long id, Client client);
    void deletar(Long id);
}
