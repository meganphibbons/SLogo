package nodes;

public class VisualTurtleLeft {//extends VisualCommand {
    private double myPixels;
    public VisualTurtleLeft(double pixels){
        myPixels = pixels;
    }
    //@Override
    public void execute(StackedCanvasPaneTurtle myCanvas) {
        myCanvas.turnLeft(myPixels);
    }
}