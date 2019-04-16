
/**
 * Lab 0415 Classwork Question 5a
 *
 * @author (Grace Jau)
 * @version (0415)
 */
public class GridTester
{
    private Cell[][] cellGrid;

    /**
     * Constructor for objects of class GridTester
     */
    public GridTester(int rows, int columns)
    {
        cellGrid = new Cell[rows][columns];
        for (int r = 0; r < cellGrid.length; r++){
            for (int c = 0; c < cellGrid[r].length; c++){
                cellGrid[r][c] = new Cell();
            }
        }
    }

    /**
     * randomly sets 30% of the cell's occupied property to true and the rest to false
     */
    public void loadOccupied()
    {
        for (int r = 0; r < cellGrid.length; r++){
            for (int c = 0; c < cellGrid[r].length; c++){
                if ((int)(Math.random()*10)<3){
                    cellGrid[r][c].setOccupied(true);
                }else{
                    cellGrid[r][c].setOccupied(false);
                }
            }
        }
    }
    
    /**
     * will load neighbors with all cells adjacent to the cell that are not occupied
     */
    public void loadNeigbors()
    {
        for (int r = 0; r < cellGrid.length; r++){
            for (int c = 0; c < cellGrid[r].length; c++){
                if (r < cellGrid.length-1 && !cellGrid[r+1][c].getOccupied()){
                    cellGrid[r][c].getNeighbors().add(cellGrid[r+1][c]);
                }
                if (r > 0 && !cellGrid[r-1][c].getOccupied()){
                    cellGrid[r][c].getNeighbors().add(cellGrid[r-1][c]);
                }
                if (c < cellGrid[r].length-1 && !cellGrid[r][c+1].getOccupied()){
                    cellGrid[r][c].getNeighbors().add(cellGrid[r][c+1]);
                }
                if (c > 0 && !cellGrid[r][c-1].getOccupied()){
                    cellGrid[r][c].getNeighbors().add(cellGrid[r][c-1]);
                }
            }
        }
    }
}
