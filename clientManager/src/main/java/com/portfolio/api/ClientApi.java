package com.portfolio.api;

import java.util.List;

public interface ClientApi {

    void createClient(Client client);
    List<Client> getClients();
    void updateClient(Client client);
    void deleteClient(String idClient);
}
