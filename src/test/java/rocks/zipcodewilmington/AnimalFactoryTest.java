package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createCat;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest(){

       Cat cat1 = AnimalFactory.createCat(null,null);
       int catId = cat1.getId();

       int id = 0;
       Assert.assertEquals(id,catId);
    }
    @Test
    public void createDogTest(){
        Dog dog1 = AnimalFactory.createDog(null,null);
        int dogID = dog1.getId();
        int id = 0;

        Assert.assertEquals(id,dogID);
    }
}

