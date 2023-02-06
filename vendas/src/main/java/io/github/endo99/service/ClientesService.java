package io.github.endo99.service;

import io.github.endo99.model.Clientes;
import io.github.endo99.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Clientes clientes) {
        validarCliente(clientes);
        this.repository.persistir(clientes);
    }

    public void validarCliente(Clientes clientes) {
        //aplicar validações;
    }
}
