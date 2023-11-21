package com.jenkins.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

    @Autowired
    private TestController testController;

    @Test
    void test1() {
        testController.test();
    }
}