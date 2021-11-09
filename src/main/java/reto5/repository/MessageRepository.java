package reto5.repository;

import reto5.crud.MessageCrud;
import reto5.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrud messageCrud;

    public List<Message> getAll () {
        return (List<Message>) messageCrud.findAll();
    }

    public Optional<Message> getMessage(int id) {
        return messageCrud.findById(id);
    }

    public Message save (Message message) {
        return messageCrud.save(message);
    }

    public void delete(Message message) {
        messageCrud.delete(message);
    }
}
