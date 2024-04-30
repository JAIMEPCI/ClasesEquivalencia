package edu.unisabana.dyas.tdd.registry;

import java.util.*;
public class Registry {
    public RegisterResult registerVoter(Person p) {

        Set<Integer> registeredIds = new HashSet();

        if (p.getAge()<18) {
            return RegisterResult.UNDERAGE;
        }


        if (Integer.toString(p.getId()).length() == 10){
            return RegisterResult.VALID;
        }

        if (Integer.toString(p.getId()).length() != 10){
            return RegisterResult.INVALID_ID;
        }

        if (p.isAlive()==false) {
            return RegisterResult.DEAD;
            
        }

        if (registeredIds.contains(p.getId())) {
            return RegisterResult.DUPLICATED;
        }

        // Register the person and add their ID to the set
        registeredIds.add(p.getId());
        return RegisterResult.VALID;
    }


}