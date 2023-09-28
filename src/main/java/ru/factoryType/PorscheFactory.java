package ru.factoryType;

import ru.entity.Cabrio;
import ru.entity.Jeep;
import ru.factoryImplementation.PorscheCabrio;
import ru.factoryImplementation.PorscheJeep;

public class PorscheFactory implements AbstractCarFactory {

    public Jeep createJeep() {
        return new PorscheJeep();
    }


    public Cabrio createCabrio() {
        return new PorscheCabrio();
    }
}