package structuralPatterns.decorator;

public class BasePizza implements Pizza {

    @Override
    public String bake() {
        return "Base Pizza";
    }

}
