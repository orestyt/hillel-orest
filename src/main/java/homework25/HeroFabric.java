package homework25;


import homework24.Hero;
import homework24.HeroDaoImpl;

import javax.sql.DataSource;
import java.util.List;

public class HeroFabric {

//    public static HeroService createService(DataSource dataSource, HeroMovieService movieService) {
//        var heroDao = new HeroDaoImpl(dataSource);
//        return new HeroService(heroDao, movieService);
//    };

    public static HeroService createService(List<Hero> heroes, HeroMovieService movieService) {
        var heroDao = new DummyHeroDao(heroes);
        return new HeroService(heroDao, movieService);
    };
}