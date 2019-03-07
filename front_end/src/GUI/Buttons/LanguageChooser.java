package GUI.Buttons;

import GUI.GUI.GUIComponent;
import GUI.Commands.Language;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.util.Collections;
import java.util.ResourceBundle;
import java.util.function.Consumer;


public class LanguageChooser extends MenuButton implements GUIComponent {

    private static final String LANGUAGES_FILE = "Languages";
    public static final String LANGUAGE = "Language";

    private ResourceBundle myLanguagesBundle;
    private Consumer<Language> myConsumer;
    private Language myLanguage;

    LanguageChooser(Consumer<Language> consumer){
        myConsumer = consumer;
        myLanguage = Language.ENGLISH;
        myLanguagesBundle = ResourceBundle.getBundle(LANGUAGES_FILE);
        buildLanguageChooser();
    }

    private void buildLanguageChooser(){
        this.setText(myLanguage.getTranslatedWord(LANGUAGE));
        for (String key : Collections.list(myLanguagesBundle.getKeys())){
            MenuItem menuItem = new MenuItem(myLanguagesBundle.getString(key));
            menuItem.setOnAction(e -> {
                setText(myLanguagesBundle.getString(key));
                myConsumer.accept(Language.valueOf(key.toUpperCase()));
            });
            this.getItems().add(menuItem);
        }
    }

}
