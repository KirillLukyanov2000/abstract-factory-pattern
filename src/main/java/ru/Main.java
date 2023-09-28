package ru;

import ru.factoryType.*;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory factory;
        factory = new BmwFactory();
        factory.createCabrio();

        factory = new PorscheFactory();
        factory.createJeep();
    }
}
