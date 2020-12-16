package com.example.workflow_enablement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class WorkflowEnablementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowEnablementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Connection conn = DriverManager.getConnection("localhost", "sa", "secret");
        conn.createStatement().execute(args[0]);
    }
}
