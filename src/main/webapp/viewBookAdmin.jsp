<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='bootstrap.min.css' />
</head>
<%
BookDAO bk = new BookDAO();
List<Book> books = bk.view();
System.out.println("from jsp page: "+books);
%>

<body>

	<table class='table table-bordered table-striped'>

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Mobile</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<% 
		for(Book bean:list){
			<tr>
			<td>bean.getId()</td>
			<td>bean.getName()</td><td>bean.getEmail()</td>
			<td>bean.getPassword()</td>
			<td>"+bean.getMobile()</td>
			<td><a href='?id="bean.getId()'>Edit</a></td>
			<td><a href='DeleteLibrarian?id="bean.getId()>Delete</a></td>
			
			</tr>
		%>
	</table>


</body>
</html>