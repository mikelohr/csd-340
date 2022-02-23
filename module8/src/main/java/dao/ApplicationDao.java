package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import bean.User;

public class ApplicationDao {


	public int registerUser(User user) {
		int rowsAffected = 0;

		try {
			System.out.println("get the connection for the database"); 
			Connection connection = DBConnection.getConnectionToDatabase();

			System.out.println(" write the insert query");
			String insertQuery = "insert into user values(?,?,?,?,?,?)";

			System.out.println(" set parameters with PreparedStatement");
			java.sql.PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getFirstName());
			statement.setString(3, user.getLastName());
			statement.setInt(4, user.getAge());
			statement.setString(5, user.getActivity());
			statement.setInt(6, user.getGoalWeight());


			// execute the statement
			rowsAffected = statement.executeUpdate();

		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return rowsAffected;
	}



	public User getProfileDetails(String username) {
		User user = null;
		try {
			System.out.println(" get connection to database for profile details");
			Connection connection = DBConnection.getConnectionToDatabase();

			System.out.println(" write select query to get profile details");
			String sql = "select * from users where user_name";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, username);

			System.out.println("execute query, get resultset and return User info");
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				user = new User();
				user.setUsername(set.getString("user_name"));
				user.setFirstName(set.getString("first_name"));
				user.setLastName(set.getString("last_name"));
				user.setActivity(set.getString("activity"));
				user.setAge(set.getInt("age"));
				user.setAge(set.getInt("goalWeight"));

			}

		}

		catch (SQLException exception) {
			exception.printStackTrace();
		}
		return user;
	}

}
