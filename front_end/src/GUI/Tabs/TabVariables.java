package GUI.Tabs;

import GUI.GUI.GUIdata;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

import java.security.DigestInputStream;
import java.util.Optional;

public class TabVariables extends SLogoTabInteractive {

    public TabVariables() {
        super();
    }

    public TabVariables(String tabTitle, GUIdata data, String title, String content) {
        super(tabTitle, data, title, content);
    }

    @Override
    protected String convertResultToRunnableString(Label label, String value){
        String[] nameAndValue = label.getText().split(" ");
        String stringToRun = "make " + nameAndValue[0] + " " +value;
        return stringToRun;
    }
}
