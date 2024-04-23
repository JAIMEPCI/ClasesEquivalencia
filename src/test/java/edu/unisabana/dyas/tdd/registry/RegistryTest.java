package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateUnderage() {
        /*
        1. Crear persona --String name, int id, int age, Gender gender, boolean alive--
        2. Establecer parametro límite
        3. Llamar función que evalua el parametro
        4. Mostar respuesta
        */
        Person person = new Person("pepe",1,5,Gender.UNIDENTIFIED,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    // TODO Complete with more test cases
}