package homework25;

import homework24.Hero;

import java.util.List;

public class HeroDto {
    private String name;
    private List<String> movies;


    public HeroDto(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    static HeroDto from(Hero hero, List<String> movies) {
        return new HeroDto(hero.getName(), movies);
    }

    public static HeroDtoBuilder builder() {
        return new HeroDtoBuilder();
    }

    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }


    public static class HeroDtoBuilder {

        private String name;
        private List<String> movies;

        public HeroDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HeroDtoBuilder movies(List<String> movies) {
            this.movies = movies;
            return this;
        }

        public HeroDto build() {
            return new HeroDto(name, movies);
        }
    }
}


