package com.githubactions.demo.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleControllerTest {

    ExampleController exampleController;

    @BeforeEach
    public void setup() {
        exampleController = new ExampleController();
    }

    @Test
    public void testSayHello() {
        String response = exampleController.sayHello();

        assertEquals("Hello Earth!", response);
    }
}
