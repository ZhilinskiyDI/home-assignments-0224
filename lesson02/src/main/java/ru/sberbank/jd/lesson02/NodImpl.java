package ru.sberbank.jd.lesson02;


public class NodImpl implements Nod{
    @Override
    public int calculate(int first, int second) {
        return second == 0 ? first : calculate(second,first % second);
    }
}
