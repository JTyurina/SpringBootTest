package springbootpackage.model;

public class Cell{
    private int x;
    private int y;
    private boolean state;
    private int neighbours;

    public Cell(int x, int y, boolean state, int neighbours) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.neighbours = neighbours;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isState() {
        return state;
    }

    public int getNeighbours() {
        return neighbours;
    }
}