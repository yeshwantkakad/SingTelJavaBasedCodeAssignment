package com.singtel.assignment;

import com.singtel.assignment.model.Bird;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Parent;
import com.singtel.assignment.model.animals.Butterfly;
import com.singtel.assignment.model.animals.Cat;
import com.singtel.assignment.model.animals.Dog;
import com.singtel.assignment.model.animals.Frog;
import com.singtel.assignment.model.birds.Chicken;
import com.singtel.assignment.model.birds.Duck;
import com.singtel.assignment.model.birds.Parrot;
import com.singtel.assignment.model.birds.Rooster;
import com.singtel.assignment.model.fish.Clownfish;
import com.singtel.assignment.model.fish.Dolphin;
import com.singtel.assignment.model.fish.Shark;
import com.singtel.assignment.utils.CountAnimals;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingTest extends AbstractTest {

    CountAnimals countAnimals;
    Parent vertebrates[] ;

    @Before
    public  void setUp(){
        this.countAnimals=new CountAnimals();
        vertebrates = new Parent[]{
                new Bird(),  //  SING, FLY ,WALK
                new Duck(),  //  SING, FLY ,WALK, SWIM
                new Chicken(), // SING, FLY ,WALK
                new Rooster(), // SING, FLY ,WALK
                new Parrot(), //SING, FLY ,WALK
                new Fish(), // SWIM
                new Shark(), // SWIM
                new Clownfish(), // SWIM
                new Dolphin(), // SWIM
                new Frog(), // SING WALK
                new Dog(), // SING WALK
                new Butterfly(), // FLY WALK
                new Cat()  // SING WALK
        };
    }

    @Test
    public void testWalkableCount(){
        int count= this.countAnimals.walkableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testFlyableCount(){
        int count= this.countAnimals.flyableCount(vertebrates);
        assertEquals(5,count);
    }

    @Test
    public void testSingableCount(){
        int count= this.countAnimals.singableCount(vertebrates);
        assertEquals(8,count);
    }

    @Test
    public void testSwimmableCount(){
        int count= this.countAnimals.swimmableCount(vertebrates);
        assertEquals(5,count);
    }
}
