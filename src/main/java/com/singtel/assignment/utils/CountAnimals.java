package com.singtel.assignment.utils;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.model.Parent;

public class CountAnimals {



    public int  walkableCount(Parent vertebrates[]) {
        int count=0;
        if(vertebrates.length==0){
            return count;
        }

        for(Parent vertibrate:vertebrates){
            if(vertibrate.getWalkable()!=null &&  vertibrate.getWalkable() instanceof CanWalk){
                count++;
            }
        }
        return count;
    }

    public int flyableCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getFlyable()!=null
                    && vertebrate.getFlyable() instanceof CanFly){
                count++;
            }
        }
        return count;
    }

    public int singableCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getSingable()!=null
                    && vertebrate.getSingable() instanceof CanSing){
                count++;
            }
        }
        return count;
    }

    public int swimmableCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getSwimmable()!=null
                    && vertebrate.getSwimmable() instanceof CanSwim){
                count++;
            }
        }
        return count;
    }
}
