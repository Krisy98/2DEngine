package Engine.Physics;

import Engine.Entity.Entity;

public class Physics {

    /**
     * This method change coordinates of a entity thanks to his speed
     * This method don't look if the entity can move
     * @param entity is the entity to move
     */
    public void move(Entity entity){
        Double speed = entity.getSpeedX();
        Double coordinate = entity.getXCoordinate();

        entity.setXCoordinate(coordinate + speed);

        speed = entity.getSpeedY();
        coordinate = entity.getYCoordinate();

        entity.setYCoordinate(coordinate + speed);
    }

}
