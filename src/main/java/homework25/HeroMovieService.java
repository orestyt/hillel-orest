package homework25;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class HeroMovieService {
    private final Map<String, List<String>> movies;


    public List<String> getPlayedIn(String heroName) {
        if (!movies.containsKey(heroName))
            return List.of();
        return movies.get(heroName);
    }
}

