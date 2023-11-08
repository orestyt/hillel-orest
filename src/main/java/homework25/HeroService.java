package homework25;


import homework24.HeroDao;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class HeroService {
    private final HeroDao heroDao;
    private final HeroMovieService movieService;

    public List<HeroDto> getHeroes() {
        return heroDao.findAll().stream()
                .map(hero -> HeroDto.from(hero, movieService.getPlayedIn(hero.getName())))
                .toList();
    }
}
