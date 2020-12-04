package Engine.Physics;

import Engine.Entity.Entity;
import Engine.Entity.Text;

import java.util.List;

public class Physics {

    public List<Entity> checkCollision(List<Entity> entities){
        // TODO
        return null;
    }

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
     * Change coordinates of the Text with speed
     * @param text to incur the action
     * @param speedX speed in the X axis
     * @param speedY spped in the Y axis
     */
    public void moveText(Text text, Double speedX, Double speedY){
        Double x = text.getPositionX();
        Double y = text.getPositionY();

        text.setPosition(x + speedX, y + speedY);
    }

    /**
     * Replace coordinates with parameters
     * @param text to incur the action
     * @param positionX coordinate in the X axis to replace
     * @param positionY coordinate in the Y axis to replace
     */
    public void setPositionText(Text text, Double positionX, Double positionY){
        text.setPosition(positionX, positionY);
    }

    /**
     * Change the size of the text
     * @param text that will incur action
     * @param size that will replace text's size
     */
    public void resize(Text text, Double size){ text.setSize(size); }

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
