package creationalPatterns.abstractFactory.os.mac;

import creationalPatterns.abstractFactory.CheckBox;

/**
 * Checkbox component for Mac app (implementing checkbox interface)
 */
public class MacCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }

}
