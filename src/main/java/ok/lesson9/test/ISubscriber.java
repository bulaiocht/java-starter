package ok.lesson9.test;

/**
 * Created by admin on 13.03.2017.
 */
public interface ISubscriber {
    void update(Message message);

    void disable(Message message);
}
