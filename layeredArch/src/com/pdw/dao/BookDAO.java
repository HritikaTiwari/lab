package com.pdw.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.pdw.beans.BookBean;
public class BookDAO {
  public int addBook(BookBean bookBean) {
		Connection con = null;
		try {
			con=BookDB.getConnection1();
			String ins_str ="insert into book values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(ins_str);
			
			pstmt.setInt(1,bookBean.getBookId());
			pstmt.setString(2,bookBean.getTitle());
			pstmt.setFloat(3,bookBean.getPrice());
			pstmt.setString(4,bookBean.getGrade());
			int updateCount = pstmt.executeUpdate();
			con.close();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		return 0;
		}
	}
}
