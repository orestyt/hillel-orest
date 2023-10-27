package homework20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroBuilderTest {

    @Test
    void shouldBuilder() {
        HeroBuilder.HeroBuilderBuilder builder = HeroBuilder.builder();
        HeroBuilder heroBuilder =  builder.height(2).name("A").build();
        assertEquals(heroBuilder.getName(), "A");
        assertEquals(heroBuilder.getHeight(), 2);
    }
}