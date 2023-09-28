package ru.factoryType;

import ru.entity.Cabrio;
import ru.entity.Jeep;
import ru.factoryImplementation.BmwCabrio;
import ru.factoryImplementation.BmwJeep;

public class BmwFactory implements AbstractCarFactory {

    public Jeep createJeep() {
        return new BmwJeep();
    }


    public Cabrio createCabrio() {
        return new BmwCabrio();
    }
}