package reto5.crud;

import reto5.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrud extends CrudRepository<Message, Integer> {
}
