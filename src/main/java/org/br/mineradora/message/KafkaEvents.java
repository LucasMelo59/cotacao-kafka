package org.br.mineradora.message;

import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ApplicationScoped //responsável por enviar informações das cotações para um tópico kakfa
public class KafkaEvents {

    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);


    @Channel("quotation") //canal de acesso ao tópico do kakfa
    Emitter<QuotationDTO> quotationRequestEmitter; // Mensável e tipo da mensagem que será enviada para o kafka

    public void sendNewKafkaEvent(QuotationDTO quotation) {
        LOG.info("-- Enviando Cotação para Tópico Kafka --");
        quotationRequestEmitter.send(quotation).toCompletableFuture().join();
    }

}
