package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEx4 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // SelectEx => try - with resources 형태로 변경
        // finally 자원 닫기 자동으로 처리

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 job입력");
        String job = sc.nextLine();
        System.out.print("조회할 empno 입력");
        int empno = sc.nextInt();

        // String sql = "SELECT * FROM emp WHERE empno = ? ;"
        String sql = "SELECT * FROM emp WHERE empno = ? or job = ? ";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            Class.forName("oracle.jdbc.OracleDriver");

            // ? 처리
            pstmt.setInt(1, empno);
            pstmt.setString(2, job);

            ResultSet rs = pstmt.executeQuery();
        }

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();) {
            Class.forName("oracle.jdbc.OracleDriver");
            if (rs.next()) {
                // number => getInt() / varchar2 => getString() / date => getDate()
                // ()안에는 컬럼 번호 or 컬럼명 가능
                System.out.println("empno : " + rs.getInt("empno"));
                System.out.println("ename : " + rs.getString("ename"));
                System.out.println("job : " + rs.getString("job"));
                System.out.println("mgr : " + rs.getInt("mgr"));
                System.out.println("hiredate : " + rs.getDate("hiredate"));
                System.out.println("sal : " + rs.getInt("sal"));
                System.out.println("comm : " + rs.getInt("comm"));
                System.out.println("deptno : " + rs.getInt("deptno"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
