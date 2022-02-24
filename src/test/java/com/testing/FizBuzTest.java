package com.testing;

import org.junit.jupiter.api.*;

class FizBuzTest {

    public FizBuz fB;

    @BeforeEach
    public void setUp() {
        fB = new FizBuz();
    }

    @DisplayName("Play FizBuz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Play FizBuz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizBuz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Don't Play FizBuz with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}
