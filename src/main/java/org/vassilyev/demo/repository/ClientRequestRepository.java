package org.vassilyev.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.vassilyev.demo.model.ClientRequest;


public interface ClientRequestRepository extends CrudRepository<ClientRequest, Long> {
}
