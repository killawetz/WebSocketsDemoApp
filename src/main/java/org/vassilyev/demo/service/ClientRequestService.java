package org.vassilyev.demo.service;

import org.vassilyev.demo.model.ClientRequest;

public interface ClientRequestService {

    public Iterable<ClientRequest> handleRequest(ClientRequest clientRequest);

}
