package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {"'Square of number is in the range', 200, 300, 3",
                    "'Square of number larger than the range', 0, 99, 0",
                    "'Square of number smaller than the range', 10001, 2147483647, 0"}
    )
    void sqrcounter(String test, int minimum, int maximum, int expected) {
        SQRService sqrService = new SQRService();
        int actual = SQRService.sqrcounter(minimum, maximum);
        assertEquals(expected, actual);
    }

}