package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    public int calcSqrt(int firstNumber, int secondNumber) {
        int numberOfSquares = 0;
        for (int i = 10; i <= 90; i++) {
            if (firstNumber < i * i && i * i < secondNumber) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }
}
