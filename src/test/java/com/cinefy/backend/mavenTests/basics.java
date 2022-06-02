package com.cinefy.backend.mavenTests;

import org.junit.jupiter.api.*;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class basics {
    @BeforeAll
    static void setUpBefore() throws Exception {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void tearDownAfter() throws Exception {
        System.out.println("@AfterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("@AfterEach");
    }

//    @Test
//    void test_add() {
//        assertEquals(10, MyUtils.add(5, 5));
//    }
//
//    @Test
//    void test_reverse() {
//        assertEquals("cba", MyUtils.reverse("abc"));
//    }
}
