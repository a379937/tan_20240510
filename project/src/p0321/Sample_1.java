package p0321;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample_1 {
	
	private static final String POSTGRES_DRIVER = "oracle.jdbc.driver.OracleDriver";
	// JDMC接続先情報
	private static final String JDBC_CONNECTION = "jdbc:oracle:thin:@192.168.0.115:1521:XE";
	// ユーザー名
	private static final String USER = "test6";
	// パスワード
	private static final String PASS = "test6";
	
	public static void main(String[] args) {// ドライバーのクラス名
		

		Connection connection = null;
		try {
			Class.forName(POSTGRES_DRIVER);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
            try {
                if (connection != null) {
                	System.out.println("connected");
                    // データベースを切断
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	
	
	}
	
	

}
