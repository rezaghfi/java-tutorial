package jalase5_database;

/**
 * Created by Bahador-PC on 3/6/2018.
 */
import java.sql.*;
public class Main {
  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "reza", "123");
      Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
      ResultSet resultSet =statement.executeQuery("select * from person");
      while (resultSet.next())
      {
        System.out.println("id ="+resultSet.getLong("id")+", name ="+resultSet.getString("name")+", family="+resultSet.getString("family")+", salary ="+resultSet.getLong("salary"));
      }
      statement.close();
      connection.close();
    }catch (Exception e)
    {
      e.printStackTrace();
    }

  }
}
