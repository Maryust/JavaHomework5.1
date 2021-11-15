package ru.netology.sqr;

public class SQRService {
    public static int sqrcounter( int minimum, int maximum) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square > minimum && square < maximum) {
                counter++;
            }
        }
        return counter;
    }
}
