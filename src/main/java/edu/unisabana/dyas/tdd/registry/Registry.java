package edu.unisabana.dyas.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge()<18) {
            return RegisterResult.UNDERAGE;
        }
        if (Integer.toString(p.getId()).length() == 10){
            return RegisterResult.VALID;
        }

        if (p.isAlive()==false) {
            return RegisterResult.DEAD;
            
        }
       
        return RegisterResult.VALID;
    }


}