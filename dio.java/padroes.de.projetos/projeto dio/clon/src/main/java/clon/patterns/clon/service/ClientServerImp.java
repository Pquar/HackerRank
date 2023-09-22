package clon.patterns.clon.service;

import clon.patterns.clon.model.Client;
import clon.patterns.clon.model.ClientRepository;
import clon.patterns.clon.model.Endereco;
import clon.patterns.clon.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServerImp implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Client> buscarTodos() {
        return clientRepository.findAll();
    }

    @Override
    public Client buscarPorId(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void inserir(Client client) {
        salvarCliente(client);
    }

    private void salvarCliente(Client client) {
        String cep = client.getEndereco().getCep();
        Endereco endereco =  enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndenereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndenereco);
            return novoEndenereco;
        });
        client.setEndereco(endereco);
        clientRepository.save(client);
    }

    @Override
    public void atualizar(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if(clientBd.isPresent()){
            salvarCliente(client);
        }
    }

    @Override
    public void deletar(Long id) {
        clientRepository.deleteById(id);
    }
}
