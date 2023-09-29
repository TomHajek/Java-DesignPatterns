package behavioralPatterns.interpreter;

/**
 * Basic expression interface can be implemented by different types of expressions.
 */
public interface Expression {

    public boolean interpret(String context);

}
