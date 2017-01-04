package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import model.Profile;

@Component("profileDAO")
public class ProfileDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public Profile getProfile(Profile profile) {
		Profile retVal = null;

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", profile.getId());

		return jdbc.queryForObject("SELECT * FROM profiles WHERE ID=:id", params, new RowMapper<Profile>() {

			@Override
			public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {

				Profile profile = new Profile();

				profile.setId(rs.getString("id"));
				profile.setName(rs.getString("name"));
				profile.setAge(rs.getString("age"));
				profile.setEmail(rs.getString("email"));
				profile.setStreet(rs.getString("street"));
				profile.setCity(rs.getString("city"));
				profile.setState(rs.getString("state"));

				return profile;

			}

		});

	}

}
