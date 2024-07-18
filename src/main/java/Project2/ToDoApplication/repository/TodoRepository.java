package Project2.ToDoApplication.repository;

import Project2.ToDoApplication.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
