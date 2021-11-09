package reto5.repository;

import reto5.crud.CategoryCrud;
import reto5.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrud categoryCrud;

    public List<Category> getAll() {
        return (List<Category>) categoryCrud.findAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryCrud.findById(id);
    }

    public Category save (Category category) {
        return categoryCrud.save(category);
    }

    public void delete(Category category) {
        categoryCrud.delete(category);
    }
}
