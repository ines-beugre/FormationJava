import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {

	// driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";

	// Database credentials
	static final String USER = "sa";
	static final String PASS = "";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			System.out.println("Connexion à la base de données...");
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				conn.setAutoCommit(false);
				System.out.println("Connexion valide?: " + conn.isValid(20));

				// Executer une requete
				System.out.println("Creation d'une table...");
				stmt = conn.createStatement();

				String req = "CREATE TABLE CAR (NAME VARCHAR(25) NOT NULL, YEAR INTEGER NOT NULL, PRIMARY KEY (NAME,YEAR) )";
				stmt.execute("DROP TABLE CAR IF EXISTS");
				System.out.println("Table supprimée");

				stmt.execute(req);
				System.out.println("Table créée");

				String insert = "INSERT INTO CAR VALUES ('PEUGEOT', 2013)";
				stmt.executeUpdate(insert);
				conn.rollback(); // permet d'annuler l'insertion

				stmt.executeUpdate("INSERT INTO CAR VALUES ('RENAULT', 2012)");
				stmt.executeUpdate("INSERT INTO CAR VALUES ('SIMCA', 1984)");

				conn.commit();
				// prepare
				String req1 = "INSERT INTO CAR VALUES (?, ?)";
				PreparedStatement ps = conn.prepareStatement(req1);
				ps.setString(1, "zrrffe");
				ps.setInt(2, 2111);
				ps.executeUpdate();

				// lecture du résultat
				String sql = "SELECT NAME, YEAR  FROM CAR";
				ResultSet rs = stmt.executeQuery(sql);

				while (rs.next()) {
					String name = rs.getString("name");
					Integer year = rs.getInt("year");

					System.out.println("nom: " + name + " année: " + year);
					System.out.println();

				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
