package nodes;
import apis.ImmutableVisualCommand;
import turtle.Bale;

import java.util.List;

public class Home extends CommandNode {
    public Home(String name){
        super(name);
    }
    /**
     * TODO - Use immutable turtle state to get current coordinates to return distance moved to go home
     */
    @Override
    public double evaluate(List<ImmutableVisualCommand> myVisCommands, Bale myTurtles) {
        for (Integer id: myTurtles.getActiveTurtlesIDs()) {
            myTurtles.get(id).setXCoor(0);
            myTurtles.get(id).setYCoor(0);
            myVisCommands.add(new VisualHomeTurtle(id));
        }
        return 0;
    }
    @Override
    public void addChild(CommandNode c){
        throw new IllegalArgumentException();
    }
}
