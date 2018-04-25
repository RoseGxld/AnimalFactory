package rocks.zipcodewilmington;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        //given (i have a dog)
        Dog dog = new Dog(null, null, null);
        String speech = "bark!";


        //when(i get that dog to speak)
        dog.speak();

        //then(i should expect what the dog says to be Bark!)
        String dogTalk = dog.speak();
        Assert.assertEquals(dogTalk, speech);
    }

    @Test
    public void eatTest() {
        //given

        Dog dog = new Dog(null, null, null);
        Food food = new Food();

        //when

        dog.eat(food);

        //then

        int numOfMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(1, numOfMeals);
    }

    @Test
    public void setDateOfBirthTest() {
        //given

        Dog dog = new Dog(null, null, null);
        Date face = new Date();


        //when


        dog.setBirthDate(face);


        //then
        Date bday = dog.getBirthDate();
        Assert.assertEquals(bday, face);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void getId() {
        //given
        Dog dog = new Dog(null, null, 13);
        int actualId = dog.getId();


        //when
        dog.getId();

        //then

        Assert.assertEquals(13, actualId);
    }
@Test
 public void inheritanceTest(){
        //given
    Dog dog1 = new Dog(null,null,null);





        //When


        //Then
        Assert.assertTrue( dog1 instanceof Mammal );
}

@Test
    public void inheritance2Test(){
        //given
        Dog dog2 = new Dog(null,null,null);
        //when

        //then
        Assert.assertEquals(true,dog2 instanceof Animal);
}





}


