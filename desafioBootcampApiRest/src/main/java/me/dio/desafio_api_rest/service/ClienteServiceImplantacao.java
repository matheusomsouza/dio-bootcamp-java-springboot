package me.dio.desafio_api_rest.service;

import me.dio.desafio_api_rest.model.Cliente;
import me.dio.desafio_api_rest.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClienteServiceImplantacao implements ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteServiceImplantacao(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente clienteToCreate) {
        if(clienteRepository.existsByContaNumeroConta(clienteToCreate.getConta().getNumeroConta())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return clienteRepository.save(clienteToCreate);
    }
}
