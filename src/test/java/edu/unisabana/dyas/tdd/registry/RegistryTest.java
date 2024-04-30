package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("pepe", 1234567891, 19, Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    

    @Test
    public void testRegisterVoterValid() {
        // Create a Person object with valid age and ID
        Person person = new Person("pepe", 1234567891, 19, Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);

        // Check if the result matches the expected result (VALID)
        Assert.assertEquals(RegisterResult.VALID, result);
    }


    @Test
    public void testRegisterVoterInvalidID() {
       
        Person person = new Person("pepe", 123456789, 19, Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);

        // Check if the result matches the expected result (VALID)
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }
   


    @Test
    public void testRegisterVoterAlive() {
       
        Person person = new Person("jose", 1234567890,19,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testRegisterVoterDead() {
       
        Person person = new Person("jose", 1234567890,19,Gender.FEMALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }


    @Test
    public void testRegisterVoterUnderAge() {
       
        Person person = new Person("jose", 1234567890,5,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

   /* @Test
    public void testDuplicatePerson() {
        
        Person person1 = new Person("John", 1234567890, 25, Gender.MALE, true);
        Person person2 = new Person("Jane", 1234567890, 30, Gender.FEMALE, true);

      
        RegisterResult result1 = registry.registerVoter(person1);

       
        RegisterResult result2 = registry.registerVoter(person2);

        // Check if the result matches the expected result (DUPLICATED)
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }*/ 



    
   


}