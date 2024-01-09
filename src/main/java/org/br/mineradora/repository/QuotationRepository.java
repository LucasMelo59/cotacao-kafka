package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.entity.QuotationEntity;

@ApplicationScoped //em tempo de execução essa classe será adminstrada e inserida no escopo de classes quando forem injetada
public class QuotationRepository implements PanacheRepository<QuotationEntity> {

}
