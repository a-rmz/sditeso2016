package mx.iteso;

/**
 * Created by a-rmz on 9/1/16.
 */
public interface Foo {
    String HELLO_WORLD = "Hello world!";
    String ANY_NEW_TOPICS = "Are there any new topics?";
    String greet();
    String question(String question);
    String questionStrictly(String question) throws InvalidQuestion;
}
