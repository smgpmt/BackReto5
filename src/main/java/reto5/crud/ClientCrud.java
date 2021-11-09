package reto5.crud;

import reto5.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrud extends CrudRepository<Client, Integer> {
}
