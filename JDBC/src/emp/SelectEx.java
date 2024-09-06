package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
    public static void main(String[] args) {
        // 1. 드라이버로드
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 사용

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection
            con = DriverManager.getConnection(url, user, password);

            // 4. connection 을 통해서 실하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM EMP WHERE EMPNO = 7369";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            // 6. 결과값이 담긴 rs에서 하나씩 조회
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
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
