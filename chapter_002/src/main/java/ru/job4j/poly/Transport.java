package ru.job4j.poly;

public interface Transport {
    void drive();
    void passengers(int quantity);
    int fill(int fuel);
}
