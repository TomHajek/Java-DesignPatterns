package creationalPatterns.abstractFactory.uifactory;

import creationalPatterns.abstractFactory.Button;
import creationalPatterns.abstractFactory.CheckBox;
import creationalPatterns.abstractFactory.os.win.WinButton;
import creationalPatterns.abstractFactory.os.win.WinCheckBox;

/**
 * Extends ui factory (interface) and creates buttons and checkboxes for Win app.
 * When we are implementing this factory, we get WinButton and WinCheckbox by default.
 */
public class WinUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

}
