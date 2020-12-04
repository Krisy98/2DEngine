package Engine.Physics;

import Engine.Entity.Entity;

public class Physics {

    /**
     * This method change coordinates of a entity thanks to his speed
     * This method don't look if the entity can move
     * @param entity is the entity to move
     */
    public void move(Entity entity){
        Double res = plus(entity.getSpeedX(), entity.getXCoordinate());
        entity.setXCoordinate(res);

        res = plus(entity.getSpeedY(), entity.getYCoordinate());
        entity.setYCoordinate(res);
    }

    /**
     * Calculate two variables of Double type and return the result
     * @param a first variable to add
     * @param b second variable to add
     * @return the result of an addition of a and b
     */
    private Double plus(Double a, Double b){
        return a + b;
    }

}
