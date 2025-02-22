package com.portfolio.rest;

import com.portfolio.api.Client;
import com.portfolio.api.ClientApi;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor    // create constructor
@Log4j2
public class ClientRest {
    private final ClientApi clientApi;

    @PostMapping("/createClient")       // name of endpoint
    public void createClient(@RequestBody Client client){   // the request has something in the body
        clientApi.createClient(client);
        log.info("New client created");
    }

    @GetMapping("/getClients")
    public List<Client> getClients(){
        log.info("Getting clients: ... ");
        return clientApi.getClients();
    }

    @PutMapping("/updateClient")
    public void updateClient(@RequestBody Client client){
        clientApi.updateClient(client);
        log.info("The client has been updated");
    }

    @DeleteMapping("/deleteClient/{idClient}")
    public void deleteClient(@PathVariable("idClient") String idClient){
        clientApi.deleteClient(idClient);
        log.info("Client with ID: {} has been removed", idClient);
    }
}
