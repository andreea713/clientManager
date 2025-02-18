package com.portfolio.srv;

import com.portfolio.api.Client;
import com.portfolio.api.ClientApi;
import com.portfolio.api.ClientNotFoundException;
import com.portfolio.dao.ClientDao;
import com.portfolio.repositories.ClientRepository;
import com.portfolio.srv.utils.ClientMapper;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
@Transactional
public class Services implements ClientApi {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public void createClient(Client client) {
        ClientDao clientDao;
        clientDao = clientMapper.toClientDao(client);
        clientRepository.save(clientDao);         // create a client in the repository
    }

    @Override
    public List<Client> getClients() {
//        List<Client> listClient = new ArrayList<>();
//        List<ClientDao> listClientDao = clientRepository.findAll();
//        for(int i=0; i<listClientDao.size(); i++){
//            listClient.add(clientMapper.toClientDto(listClientDao.get(i)));
//        }
//      return listClient;

        return clientRepository.findAll()
                .stream()
                .map(clientMapper::toClientDto)
                .toList();
    }

    @Override
    public void updateClient(Client client) {
        clientRepository.findById(client.getIdClient()).orElseThrow(() -> new ClientNotFoundException("Client with ID: " + client.getIdClient() + "couldn't be found"));
        clientRepository.save(clientMapper.toClientDao(client));
    }

    @Override
    public void deleteClient(String idClient) {
        clientRepository.findById(UUID.fromString(idClient)).orElseThrow(() -> new ClientNotFoundException("Client with ID: " + idClient + "couldn't be found"));
        clientRepository.deleteById(UUID.fromString(idClient));
    }
}
