package creationalPatterns.abstractFactory.uifactory;

import creationalPatterns.abstractFactory.Button;
import creationalPatterns.abstractFactory.CheckBox;

/**
 * UI Factory creates buttons and checkboxes for the application.
 * This interface is implemented by Windows or Mac UI factory.
 */
public interface UIFactory {

    // Button and Checkbox are again interfaces
    Button createButton();
    CheckBox createCheckBox();

}
