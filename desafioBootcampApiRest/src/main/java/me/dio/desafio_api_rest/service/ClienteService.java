package me.dio.desafio_api_rest.service;

import me.dio.desafio_api_rest.model.Cliente;

public interface ClienteService {
    Cliente findById(Long id);

    Cliente create(Cliente clienteToCreate);
}
