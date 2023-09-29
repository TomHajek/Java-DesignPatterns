package creationalPatterns.abstractFactory.os.mac;

import creationalPatterns.abstractFactory.Button;

/**
 * Button component for Mac app (implementing button interface)
 */
public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }

}
