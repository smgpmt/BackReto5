package reto5.crud;

import reto5.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrud extends CrudRepository<Category, Integer> {
}
