package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
       public int calcSqrt(int x, int y) {
int s = 0;
        for (int i = 10; i <= 90; i++) {
            if (x < i*i && i*i < y) {
                s++;
            }
        }
           return s;
    }
}
