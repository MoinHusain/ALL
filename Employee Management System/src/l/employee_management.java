package l;

import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class employee_management {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ArrayList<Integer> point = new ArrayList<>();

		String name = "a";
		int JobPerf = 0;
		int Behaviour = 0;
		int Teamwork = 0;
		int Inititative = 0;
		Scanner sc = new Scanner(System.in);

		// Choices proceed for the user with

		System.out.println("Employee Management System\nPlease select from the below :-");
		System.out.println("");
		System.out.println("1. Add New Employee ");
		System.out.println("2. Review Employee ");
		System.out.println("3. Edit Employee scores ");
		System.out.println("4. Delete Employee ");
		System.out.println("5. Exit System ");

		int Choice = sc.nextInt();

		// Post to WorkBench

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBs", "root", "root");
		Statement stmt = con.createStatement();

		// Choices proceed for the user with

		switch (Choice) {
		case 1:
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("");
			System.out.println("Enter Employee's JobPerf out of 10");
			JobPerf = sc.nextInt();
			System.out.println("");
			System.out.println("Enter Employee's Behaviour out of 10");
			Behaviour = sc.nextInt();
			System.out.println("");
			System.out.println("Enter Employee's Teamwork out of 10");
			Teamwork = sc.nextInt();
			System.out.println("");
			System.out.println("Enter Employee's Inititative out of 10");
			Inititative = sc.nextInt();
			System.out.println("");
			point.add(JobPerf);
			point.add(Behaviour);
			point.add(Teamwork);
			point.add(Inititative);

			String s = "INSERT INTO Employees1 (name, JobPerf, Behaviour, Teamwork, Inititative) VALUES ('" + name
					+ "', " + JobPerf + ", " + Behaviour + ", " + Teamwork + ", " + Inititative + ")";
			stmt.execute(s);
			con.close();
			System.out.println("Employee Added to the DataBase");

			break;

		case 2:
			System.out.println("Enter Employee Name");
			name = sc.next();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employees1 WHERE name = '" + name + "'");
			while (rs.next()) {
				System.out.println("JobPerf : " + rs.getInt("JobPerf") + " " + "\nBehaviour : " + rs.getInt("Behaviour")
						+ " " + "\nTeamwork : " + rs.getInt("Teamwork") + " " + "\nInititative : "
						+ rs.getInt("Inititative"));

			}
			sc.close();
			System.exit(0);
			break;

		case 3:
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter the skill to update from JobPerf, Behaviour, Teamwork, Inititative");
			String skilltype = sc.next();
			if ("JobPerf".equals(skilltype) || "Behaviour".equals(skilltype) || "Teamwork".equals(skilltype)
					|| "Inititative".equals(skilltype)) {
				System.out.println("Enter the updated scores");
				int updatedScores = sc.nextInt();
				String updateQuery = "UPDATE Employees1 SET " + skilltype + " = '" + updatedScores + "'  WHERE name = '"
						+ name + "'";
				stmt.execute(updateQuery);

			}
			System.out.println("Scores updated Please restart");
			sc.close();
			System.exit(0);
			break;
		case 4:
			System.out.println("Enter Employee name");
			name = sc.next();
			String removed = "DELETE FROM EMPLOYEEs1 WHERE name = '" + name + "'";
			stmt.execute(removed);
			System.out.println("Employee removed from the database");
			break;
			
		case 5:
			System.out.println("Employee Management System Closed");
		}

	}

}
