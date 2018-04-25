package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getNumberOfCats;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`



    @Test
    public void addTest(){
        //given
        Cat cat1 = new Cat(null,null,null);
        CatHouse kittyclub = new CatHouse();


        //when

        CatHouse.add(cat1);
        //then
        int amt = 1;
        int addedCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(amt,addedCats);
    }

    @Test
    public void removeByAnimalTest(){
        //given

        Cat cat2 = new Cat(null,null,null);
        CatHouse funfactory = new CatHouse();

        //when
        CatHouse.remove(cat2);


        //then
        int amt = 0;
        int removedCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(amt,removedCats);
    }
    @Test
    public void removeByIdTest(){
        //given
        Cat cat2 = new Cat(null,null,2);
        CatHouse.add(cat2);

        //when
        CatHouse.remove(2);

        //then
        int amt = 0;
        int removeCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(amt,removeCats);
    }
@Test
    public void getCatByIdTest(){
        //given
        Cat cat = new Cat(null,null,4);
        CatHouse.add(cat);

        //when
        CatHouse.getCatById(4);


        //then
        Cat lit = CatHouse.getCatById(4);
        Assert.assertEquals(lit,cat);
}




}
