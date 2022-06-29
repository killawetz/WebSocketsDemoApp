package org.vassilyev.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.vassilyev.demo.model.ClientRequest;
import org.vassilyev.demo.service.ClientRequestService;

@Controller
public class RequestController {

    private final ClientRequestService clientRequestService;

    public RequestController(ClientRequestService clientRequestService) {
        this.clientRequestService = clientRequestService;
    }

    @MessageMapping("/request")
    @SendTo("/resp/list")
    public Iterable<ClientRequest> processCommand(@Payload ClientRequest clientRequest) {
        return clientRequestService.handleRequest(clientRequest);
    }

}
