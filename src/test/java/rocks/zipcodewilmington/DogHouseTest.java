package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void GetNumberOfDogsTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addTest(){
        //given
        Dog dog1 = new Dog(null,null,null);
        DogHouse pub = new DogHouse();


        //when

        DogHouse.add(dog1);
        //then
        int amt = 1;
        int addedDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(amt,addedDogs);
    }

    @Test
    public void removeByAnimalTest(){
        //given

        Dog dog2 = new Dog(null,null,null);
        DogHouse thepalace = new DogHouse();

        //when
        DogHouse.remove(dog2);


        //then
        int amt = 0;
        int removedDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(amt,removedDogs);
    }
    @Test
    public void removeByIdTest(){
        //given
        Dog dog = new Dog(null,null,2);
        DogHouse.add(dog);

        //when
        DogHouse.remove(2);

        //then
        int amt = 0;
        int removeDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(amt,removeDogs);
    }
    @Test
    public void getCatByIdTest(){
        //given
        Dog dog = new Dog(null,null,4);
        DogHouse.add(dog);

        //when
        DogHouse.getDogById(4);


        //then
        Dog live = DogHouse.getDogById(4);
        Assert.assertEquals(live,dog);
    }

}
