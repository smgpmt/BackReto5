package reto5.crud;

import reto5.model.Computer;
import org.springframework.data.repository.CrudRepository;

public interface ComputerCrud extends CrudRepository<Computer, Integer> {
}
