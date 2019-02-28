


package parser.external;
import java.util.ArrayList;
import java.util.List;

import apis.ImmutableVisualCommand;
import exceptions.InvalidCommandException;
import nodes.CommandNode;
import nodes.VisualCommand;
import parser.Parser;
import turtle.ImmutableTurtleState;

public class CommandController {
    private Parser myParser;
    private static final int INVALID_COMMAND = 0;
    List<ImmutableVisualCommand> myVisualCommands;

    public CommandController(){
        myParser = new Parser();
    }

    public double execute(String command) throws InvalidCommandException {
        myVisualCommands = new ArrayList<ImmutableVisualCommand>();
        CommandNode myNode = myParser.parse(command).get(0); // note of change! This is changed now because their could be many commands in a list that come from a parser.
        return myNode.evaluate(myVisualCommands);

        //pass list of visual commands to vis
        //would need to write
        //for (nodes.VisualCommand c: myVisualCommands)
        // c.execute(myCanvas);
    }
    public List<ImmutableVisualCommand> getMyVisualCommands(){
        return myVisualCommands;
    }
    public void updateTurtle(ImmutableTurtleState currentState) {

    }

}