package edu.unisabana.dyas.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge()<18 || p.getAge()>0) {
            return RegisterResult.UNDERAGE;
        }
        if (Integer.toString(p.getId()).length() == 10){
            return RegisterResult.VALID;
        }
        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }


}