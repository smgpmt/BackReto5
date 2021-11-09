package reto5.repository;

import reto5.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import reto5.crud.ComputerCrud;

@Repository
public class ComputerRepository {
    @Autowired
    private ComputerCrud computerCrud;

    public List<Computer> getAll() {
        return (List<Computer>) computerCrud.findAll();
    }

    public Optional<Computer> getComputer(int id) {
        return computerCrud.findById(id);
    }

    public Computer save (Computer computer) {
        return computerCrud.save(computer);
    }

    public void delete (Computer computer) {
        computerCrud.delete(computer);
    }
}
