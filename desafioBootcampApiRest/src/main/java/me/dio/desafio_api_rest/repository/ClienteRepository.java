package me.dio.desafio_api_rest.repository;

import me.dio.desafio_api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Boolean existsByContaNumeroConta(String numeroConta);
}
