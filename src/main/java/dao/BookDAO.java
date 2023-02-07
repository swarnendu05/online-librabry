package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import utils.DbConnection;



public class BookDAO {

	public static String save(Book bk) throws SQLException{

		
			Connection con=DbConnection.createConnection();
			
			String sql_query = "insert into books (title,name,author,publisher,description,quantity,price) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql_query);

			ps.setString(1, bk.getTitle());
			ps.setString(2, bk.getName());
			ps.setString(3, bk.getPublisher());
			ps.setString(4, bk.getDescription());
			ps.setString(5, bk.getPublisher());
			ps.setInt(6, bk.getQuantity());
			ps.setString (7, bk.getPrice());
			
			int res = ps.executeUpdate();
			
			//System.out.println("Printing Db response: " + res);
			if (res > 0) {
				con.close();
				return "Success";
			}
			
			return "Faild";
		
		
		
		//con.close();
		//return "Faild";
	}

	

	public static List<Book> view(){
		List<Book> list=new ArrayList<Book>();
		try{
			Connection con = DbConnection.createConnection();
			PreparedStatement ps=con.prepareStatement("select * from mylibrary.books");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Book bk=new Book();
				//bean.setCallno(rs.getString("callno"));
				
				bk.setId(rs.getInt("book_id"));
				bk.setTitle(rs.getString("title"));
				//bk.setName(rs.getString("name"));
				bk.setAuthor(rs.getString("author"));
				bk.setPublisher(rs.getString("publisher"));
				bk.setQuantity(rs.getInt("quantity"));
			
				//bean.setIssued(rs.getInt("issued"));
				System.out.println("from book dao"+bk.getQuantity());
				list.add(bk);
			}
			con.close();
			
			
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	
	
	/*
	public static int delete(String book_id){
		int status=0;
		try{
			Connection con = DbConnection.createConnection();;
			PreparedStatement ps=con.prepareStatement("delete from mylibrary.books where nane=?");
			ps.setString(1,callno);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	public static int getIssued(String callno){
		int issued=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from mylibrary.books where callno=?");
			ps.setString(1,callno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				issued=rs.getInt("issued");
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return issued;
	}
	public static boolean checkIssue(String callno){
		boolean status=false;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from e_book where callno=? and quantity>issued");
			ps.setString(1,callno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				status=true;
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	/*
	public static int issueBook(IssueBookBean bean){
		String callno=bean.getCallno();
		System.out.println("Check status: "+checkstatus);
		if(checkstatus){
			int status=0;
			try{
				Connection con=DB.getCon();
				PreparedStatement ps=con.prepareStatement("insert into e_issuebook values(?,?,?,?,?,?)");
				ps.setString(1,bean.getCallno());
				ps.setString(2,bean.getStudentid());
				ps.setString(3,bean.getStudentname());
				ps.setLong(4,bean.getStudentmobile());
				java.sql.Date currentDate=new java.sql.Date(System.currentTimeMillis());
				ps.setDate(5,currentDate);
				ps.setString(6,"no");
				
				status=ps.executeUpdate();
				if(status>0){
					PreparedStatement ps2=con.prepareStatement("update e_book set issued=? where callno=?");
					ps2.setInt(1,getIssued(callno)+1);
					ps2.setString(2,callno);
					status=ps2.executeUpdate();
				}
				con.close();
				
			}catch(Exception e){System.out.println(e);}
			
			return status;
		}else{
			return 0;
		}
	}
	public static int returnBook(String callno,int studentid){
		int status=0;
			try{
				Connection con=DB.getCon();
				PreparedStatement ps=con.prepareStatement("update e_issuebook set returnstatus='yes' where callno=? and studentid=?");
				ps.setString(1,callno);
				ps.setInt(2,studentid);
				
				status=ps.executeUpdate();
				if(status>0){
					PreparedStatement ps2=con.prepareStatement("update e_book set issued=? where callno=?");
					ps2.setInt(1,getIssued(callno)-1);
					ps2.setString(2,callno);
					status=ps2.executeUpdate();
				}
				con.close();
				
			}catch(Exception e){System.out.println(e);}
			
			return status;
	}
	public static List<IssueBookBean> viewIssuedBooks(){
		List<IssueBookBean> list=new ArrayList<IssueBookBean>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from e_issuebook order by issueddate desc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				IssueBookBean bean=new IssueBookBean();
				bean.setCallno(rs.getString("callno"));
				bean.setStudentid(rs.getString("studentid"));
				bean.setStudentname(rs.getString("studentname"));
				bean.setStudentmobile(rs.getLong("studentmobile"));
				bean.setIssueddate(rs.getDate("issueddate"));
				bean.setReturnstatus(rs.getString("returnstatus"));
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int update(LibrarianBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update e_librarian set name=?,email=?,password=?,mobile=? where id=?");
			ps.setString(1,bean.getName());
			ps.setString(2,bean.getEmail());
			ps.setString(3,bean.getPassword());
			ps.setLong(4,bean.getMobile());
			ps.setInt(5,bean.getId());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static LibrarianBean viewById(int id){
		LibrarianBean bean=new LibrarianBean();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from e_librarian where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPassword(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setMobile(rs.getLong(5));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return bean;
	}
*/



	
}
