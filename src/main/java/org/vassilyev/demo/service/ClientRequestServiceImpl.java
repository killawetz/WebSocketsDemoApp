package org.vassilyev.demo.service;

import org.springframework.stereotype.Service;
import org.vassilyev.demo.model.ClientRequest;
import org.vassilyev.demo.repository.ClientRequestRepository;

@Service
public class ClientRequestServiceImpl implements ClientRequestService {

    private final ClientRequestRepository clientRequestRepository;

    public ClientRequestServiceImpl(ClientRequestRepository clientRequestRepository) {
        this.clientRequestRepository = clientRequestRepository;
    }

    public Iterable<ClientRequest> handleRequest(ClientRequest clientRequest) {
        switch (clientRequest.getCommand()) {
            case ADD_LOG:
                clientRequestRepository.save(clientRequest);
            case LOGS:
                return clientRequestRepository.findAll();
        }
        return null;
    }

}
