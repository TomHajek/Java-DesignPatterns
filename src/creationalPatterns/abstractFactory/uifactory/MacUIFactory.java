package creationalPatterns.abstractFactory.uifactory;

import creationalPatterns.abstractFactory.Button;
import creationalPatterns.abstractFactory.CheckBox;
import creationalPatterns.abstractFactory.os.mac.MacButton;
import creationalPatterns.abstractFactory.os.mac.MacCheckBox;

/**
 * Extends ui factory (interface) and creates buttons and checkboxes for Mac app.
 * When we are implementing this factory, we get MacButton and MacCheckbox by default.
 */
public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

}
