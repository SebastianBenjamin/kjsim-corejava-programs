import java.sql.*;
import java.util.*;

class JDBCInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement stmt = Con.createStatement();

            int[] java = new int[4];
            int[] python = new int[4];
            int[] c = new int[4];
            String[] name = new String[4];

            ResultSet rs = stmt.executeQuery("select * from studentdetails");
            int i = 0;
            System.out.println("\n +-------------------------------------------------------------------------------------------------------+");
	    System.out.println(" |                                                 STUDENTS                                              |");
            System.out.println(" +-------------------------------------------------------------------------------------------------------+");
            while (rs.next()) {
                java[i] = rs.getInt(5);
                python[i] = rs.getInt(6);
                c[i] = rs.getInt(7);
                name[i] = rs.getString(2);
                i++;

                System.out.println(" |  " + rs.getInt(1) + " | " + Fill(rs.getString(2)) + " | " + Fill(rs.getString(3)) + " | " + Fill(rs.getString(4)) + " | " + rs.getInt(5) + " | " + rs.getInt(6) + " | " + rs.getInt(7) + " | ");
            }

            System.out.println(" +-------------------------------------------------------------------------------------------------------+");





ResultSet rsp = stmt.executeQuery("select * from studentdetails where (Java+Python+Cprogram)>=210");

            System.out.println("\n +-------------------------------------------------------------------------------------------------------+");
	    System.out.println(" |                                               DISTINCTION                                             |");
            System.out.println(" +-------------------------------------------------------------------------------------------------------+");
            while (rsp.next()) {
               

                System.out.println(" |  " + rsp.getInt(1) + " | " + Fill(rsp.getString(2)) + " | " + Fill(rsp.getString(3)) + " | " + Fill(rsp.getString(4)) + " | " + rsp.getInt(5) + " | " + rsp.getInt(6) + " | " + rsp.getInt(7) + " | ");
            }

            System.out.println(" +-------------------------------------------------------------------------------------------------------+");








ResultSet rsf = stmt.executeQuery("select * from studentdetails where (Java+Python+Cprogram)<210");

            System.out.println("\n +-------------------------------------------------------------------------------------------------------+");
	    System.out.println(" |                                                 FAILED                                                |");
            System.out.println(" +-------------------------------------------------------------------------------------------------------+");
            while (rsf.next()) {
               

                System.out.println(" |  " + rsf.getInt(1) + " | " + Fill(rsf.getString(2)) + " | " + Fill(rsf.getString(3)) + " | " + Fill(rsf.getString(4)) + " | " + rsf.getInt(5) + " | " + rsf.getInt(6) + " | " + rsf.getInt(7) + " | ");
            }
 
            System.out.println(" +-------------------------------------------------------------------------------------------------------+");






            Con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String Fill(String str) {
        for (int i = 0; i < 25; i++) {
            if (str.length() < i) {
                str += " ";
            }
        }
        return str;
    }
}