package  classes;
public abstract class GraphicObject{
    private int x, y;
    void moveTo(int newX, int newY){
        System.out.println("move to x: " + x + " and y: " + y);
    }
    abstract void draw();
    abstract void resize();


}