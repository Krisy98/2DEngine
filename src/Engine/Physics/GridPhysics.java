package Engine.Physics;

import Engine.Entity.Entity;
import Engine.Entity.Grid;

import java.util.ArrayList;
import java.util.List;

public class GridPhysics extends Physics {

    private List<Grid> grids;

    public GridPhysics(){
        grids = new ArrayList<>();
    }

    /**
     * Create a grid with params and add it to the list of grids
     * @param positionX the X coordinate of the grid
     * @param positionY the Y coordinate of the grid
     * @param width of a case of the grid
     * @param height of a case of the grid
     * @param rowNumber the number of rows of the grid
     * @param columnsNumber the number of columns of the grid
     */
    public void createGrid(Double positionX, Double positionY, Double width, Double height, int rowNumber, int columnsNumber){
        Grid temp = new Grid(positionX, positionY, width, height, rowNumber, columnsNumber);

        grids.add(temp);
    }

    public boolean adaptEntityToTheGrid(Entity entity){
        // TODO
        return false;
    }

    public int getIndexes(Double x, Double y){
        //TODO
        return 1;
    }

    public List<Double> getCoordinatesForGrid(Double x, Double y){
        // TODO
        return null;
    }

    public void setPosition(Entity entity, Double positionX, Double positionY){
        entity.setXCoordinate(positionX);
        entity.setYCoordinate(positionY);
    }

}
