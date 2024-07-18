package Project2.ToDoApplication.service;

import Project2.ToDoApplication.dto.TodoDto;

import java.util.List;


public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodo(Long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto, Long id);

    void deleteTodo(Long todoId);

    TodoDto completeTodo(Long id);

    TodoDto inCompleteTodo(Long id);
}
