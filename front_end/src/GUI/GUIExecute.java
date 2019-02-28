package GUI;

import exceptions.InvalidCommandException;

@FunctionalInterface
public interface GUIExecute {
    void executeCurrentCommand(String c, String language) throws InvalidCommandException;
}
