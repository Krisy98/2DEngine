package Engine.Entity;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Double> coordinates;
    private List<Double> size;
    private int rowNumber;
    private int columnsNumber;

    public Grid(Double positionX, Double positionY, Double width, Double height, int rowNumber, int columnsNumber){
        coordinates = new ArrayList<>();
        coordinates.add(positionX);
        coordinates.add(positionY);

        size = new ArrayList<>();
        size.add(width);
        size.add(height);

        this.rowNumber = rowNumber;
        this.columnsNumber = columnsNumber;
    }

    public Double getWidth(){ return this.size.get(0); }

    public Double getHeight(){ return this.size.get(1); }

    public Double getPositionX(){ return coordinates.get(0); }

    public Double getPositionY(){ return coordinates.get(1); }

    public int getRowNumber(){ return this.rowNumber; }

    public int getColumnsNumber(){ return this.columnsNumber; }

}
