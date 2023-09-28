package ru.factoryType;

import ru.entity.Cabrio;
import ru.entity.Jeep;

public interface AbstractCarFactory {
    Jeep createJeep();
    Cabrio createCabrio();
}
