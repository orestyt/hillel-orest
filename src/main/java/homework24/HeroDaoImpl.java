package homework24;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class HeroDaoImpl implements HeroDao {
    private final DataSource dataSource;

    @Override
    public List<Hero> findAll() {
        var sql = "select * from Hero";
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var result = statement.executeQuery(sql);
            return mapHeroes(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<Hero> mapHeroes(ResultSet result) throws SQLException {
        var heroes = new ArrayList<Hero>();
        while (result.next()) {
            heroes.add(Hero.builder()
                    .id(result.getInt("id"))
                    .name(result.getString("name"))
                    .gender(result.getString("gender"))
                    .eyeColor(result.getString("eyeColor"))
                    .race(result.getString("race"))
                    .hairColor(result.getString("hairColor"))
                    .height(result.getDouble("height"))
                    .publisher(result.getString("publisher"))
                    .skinColor(result.getString("skinColor"))
                    .alignment(result.getString("alignment"))
                    .weight(result.getInt("weight"))
                    .build());
        }
        return heroes;
    }

    @Override
    public List<Hero> findByName(String name) {
        var sql = "select * from Hero where name = '" + name + "'";
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var result = statement.executeQuery(sql);
            return mapHeroes(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Hero hero) {
        var sql = "insert into Hero "+
                "(id, name, gender, eyeColor, race, hairColor, height, publisher, skinColor, alignment, weight)" +
                "values ( " + hero.getId() +"," + hero.getName()+","+hero.getGender()+","+hero.getEyeColor()+","+hero.getRace()+
                ","+hero.getHairColor()+","+hero.getHeight()+","+hero.getPublisher()+","+hero.getSkinColor()+","
                + hero.getAlignment()+","+hero.getWeight() +");";
        try (var connection = dataSource.getConnection();
             var statement = connection.prepareStatement(sql)) {
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Hero hero) {
        var sql = """
                update Hero set name =?, gender=?, race=?, publisher=?
                where id=?
                """;
        try(var connection = dataSource.getConnection();
        var statement = connection.prepareStatement(sql)) {
            statement.setString(1, hero.getName());
            statement.setString(2, hero.getGender());
            statement.setString(3, hero.getRace());
            statement.setString(4, hero.getPublisher());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Long id) {
        var sql = "delete from hero where id = ?";
        try (var connection = dataSource.getConnection();
        var statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            statement.executeQuery();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return true;
    }

}
