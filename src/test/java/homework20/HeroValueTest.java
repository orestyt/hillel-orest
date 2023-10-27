package homework20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroValueTest {
    @Test
    void shouldBuilder() {
        HeroValue hero = new HeroValue("A-Bomb", "Male", "yellow", "Human", "No Hair", 203, "Marvel Comics", "-", "good", 441);
        assertEquals(hero.getName(), "A-Bomb");
    }

}