package behavioralPatterns.mediator;

/**
 * Mediator interface
 */
public interface ChatMediator {

    // Mediator methods
    public void sendMessage(String msg, User user);
    void addUser(User user);

}
