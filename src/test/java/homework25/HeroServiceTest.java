package homework25;

import homework24.Hero;
import homework24.HeroDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HeroServiceTest {
    @InjectMocks
    private HeroService heroService;
    @Mock
    private HeroDao heroDao;

    private HeroService target;

    @Test
    void shouldGetHeroes() {
        var mockHeroDao = Mockito.mock(HeroDao.class);
        Mockito.when(mockHeroDao.findAll()).thenReturn(List.of(
                Hero.builder().build(),
                Hero.builder().build(),
                Hero.builder().build()
        ));
        var movieService = new HeroMovieService(new HashMap<String, List<String>>());
        target = new HeroService(mockHeroDao, movieService);
        var heroes = target.getHeroes();
        assertEquals(heroes.size(), 3);
    }


    @Test
    void shouldReturnListOfHeroes() {
        Map<String, List<String>> movies = new HashMap<>();
        movies.put("Vlad", List.of("Lorddd"));
        movies.put("Ppp", List.of("asd", "qwe"));
        movies.put("Kys", List.of("jojo", "barbie"));
        List<Hero> heroes = List.of(
                Hero.builder().id(0).name("Vlad").build(),
                Hero.builder().id(1).name("Ppp").build(),
                Hero.builder().id(3).name("Kys").build()
        );
        var movieService = new HeroMovieService(movies);
        var heroService = HeroFabric.createService(heroes, movieService);
        var heroes2 = heroService.getHeroes();
        assertEquals(heroes2.get(0).getName(), "Vlad");
        Assertions.assertIterableEquals(heroes2.get(0).getMovies(), List.of("Lorddd"));
        assertEquals(heroes2.get(1).getName(), "Ppp");
        Assertions.assertIterableEquals(heroes2.get(1).getMovies(), List.of("asd", "qwe"));

    }
}