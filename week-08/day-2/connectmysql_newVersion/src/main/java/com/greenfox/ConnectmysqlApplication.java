package com.greenfox;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectmysqlApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectmysqlApplication.class, args);
  }

  @Autowired
  TodoRepository todoRepository;

  @Override
  public void run(String... args) throws Exception {

  }
}
