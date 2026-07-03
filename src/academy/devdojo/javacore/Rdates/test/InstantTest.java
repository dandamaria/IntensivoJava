package academy.devdojo.javacore.Rdates.test;
import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(Instant.now());
        //Instant trabalha com nano segundos
        System.out.println(now.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(-1_000_000_000));
    }
}
