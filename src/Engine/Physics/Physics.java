package Engine.Physics;

import Engine.Entity.Entity;

public class Physics {

    public void move(Entity entity){
        Double speed = entity.getSpeedX();
        Double coordinate = entity.getXCoordinate();

        entity.setXCoordinate(coordinate + speed);

        speed = entity.getSpeedY();
        coordinate = entity.getYCoordinate();

        entity.setYCoordinate(coordinate + speed);
    }

}
