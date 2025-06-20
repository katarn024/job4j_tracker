package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = false;
        if (citizens.get(citizen.getPassport()) == null) {
            citizens.put(citizen.getPassport(), citizen);
        }
        return result;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
