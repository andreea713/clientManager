package com.portfolio.rest;

import com.portfolio.api.Client;
import com.portfolio.api.ClientApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor    // create constructor
public class ClientRest {
    private final ClientApi clientApi;

    @PostMapping("/createClient")       // name of endpoint
    public void createClient(@RequestBody Client client){   // the request has something in the body
        clientApi.createClient(client);
    }
}
