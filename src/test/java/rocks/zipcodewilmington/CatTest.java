package rocks.zipcodewilmington;

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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat dog = new Cat(null, null, null);
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
        Cat cat = new Cat(null, null, null);
        String speech = "meow!";


        //when(i get that dog to speak)
        cat.speak();

        //then(i should expect what the dog says to be Bark!)
        String dogTalk = cat.speak();
        Assert.assertEquals(dogTalk, speech);


    }
    @Test
    public void eatTest() {
        //given

        Cat cat = new Cat(null, null, null);
        Food food = new Food();

        //when

        cat.eat(food);

        //then

        int numOfMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(1, numOfMeals);
    }

    @Test
    public void setDateOfBirthTest() {
        //given

        Cat cat= new Cat(null, null, null);
        Date face = new Date();


        //when


        cat.setBirthDate(face);


        //then
        Date bday = cat.getBirthDate();
        Assert.assertEquals(bday, face);
    }

    @Test
    public void getId() {
        //given
        Cat cat = new Cat(null, null, 13);
        int actualId = cat.getId();


        //when
        cat.getId();

        //then

        Assert.assertEquals(13, actualId);
    }

    @Test
    public void inheritanceTest(){
        //given
        Cat cat1 = new Cat(null,null,null);





        //When


        //Then
        Assert.assertTrue( cat1 instanceof Mammal);
    }

    @Test
    public void inheritance2Test(){
        //given
        Cat cat2 = new Cat(null,null,null);
        //when

        //then
        Assert.assertEquals(true,cat2 instanceof Animal);
    }




}
