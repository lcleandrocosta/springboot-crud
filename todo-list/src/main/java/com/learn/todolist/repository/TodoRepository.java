package com.learn.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{    
}
