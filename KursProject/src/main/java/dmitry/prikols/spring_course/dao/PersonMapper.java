package dmitry.prikols.spring_course.dao;

import dmitry.prikols.spring_course.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person>{
    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("Email"));
        person.setAge(resultSet.getInt("age"));
        return person;
    }
}
