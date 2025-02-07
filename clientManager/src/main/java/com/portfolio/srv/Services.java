package com.portfolio.srv;

import com.portfolio.api.Client;
import com.portfolio.api.ClientApi;
import com.portfolio.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class Services implements ClientApi {

    private final ClientRepository clientRepository;

    @Override
    public void createClient(Client client) {
        clientRepository.save(client);         // create a client in the repository
    }
}
