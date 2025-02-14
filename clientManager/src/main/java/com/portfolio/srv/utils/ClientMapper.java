package com.portfolio.srv.utils;

import com.portfolio.api.Client;
import com.portfolio.dao.ClientDao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDao toClientDao (Client client);
    Client toClientDto (ClientDao clientDao);
}
