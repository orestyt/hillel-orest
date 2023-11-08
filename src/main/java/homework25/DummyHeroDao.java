package homework25;

import homework24.Hero;
import homework24.HeroDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class DummyHeroDao implements HeroDao {

    private final Map<Integer, Hero> db;

    public DummyHeroDao(List<Hero> db) {
        this.db = new HashMap<>(db.stream().collect(toMap(Hero::getId, x->x)));
    }


    @Override
    public List<Hero> findAll() {
        return db.values().stream().toList();
    }

    @Override
    public List<Hero> findByName(String name) {
        return db.values().stream()
                .filter(hero -> hero.getName().equals(name))
                .toList();
    }

    @Override
    public void create(Hero hero) {
        db.put(hero.getId(), hero);
    }

    @Override
    public void update(Hero hero) {
        if(db.containsKey(hero.getId())){
            db.put(hero.getId(), hero);
        }
    }

    @Override
    public boolean delete(Long id) {
        return db.remove(id) != null;
    }
}
