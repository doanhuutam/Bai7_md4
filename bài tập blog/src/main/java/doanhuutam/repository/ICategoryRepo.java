package doanhuutam.repository;

import doanhuutam.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category,Long> {
}
