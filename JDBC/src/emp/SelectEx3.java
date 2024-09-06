package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx3 {
    public static void main(String[] args) {
        // SelectEx => try - with resources 형태로 변경
        // finally 자원 닫기 자동으로 처리

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";
        String sql = "SELECT * FROM EMP";

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
