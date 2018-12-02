<%-- 
    Document   : ridereg
    Created on : 26 Nov, 2018, 11:32:43 AM
    Author     : HP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td {
    border: 1px solid black;
}
            </style>
    </head>
    <body>
        <%
            
            try{
            String f_p = request.getParameter("f_p");
            String t_p = request.getParameter("t_p");
            String date = request.getParameter("date");
            String myurl="jdbc:mysql://localhost/rides";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from info where f_p='"+f_p+"' and t_p='"+t_p+"' and date='"+date+"'";
                ResultSet rs=st.executeQuery(query1);
                String driver,no,car;
                %><table>
                    <tr>
                        <th>Driver name</th>
                        <th>Driver no</th>
                        <th>car no</th>
                    </tr><%
            while(rs.next()){
              driver=rs.getString("d_name");
            no=rs.getString("d_no");
            car=rs.getString("car_no");
            %><tr>
                
            <td><%out.println(driver);%></td>
            <td><%out.println(no);%></td>
            
            <td><%out.println(car);%></td>
           
            </tr> <%   
            st.close();
            }
            }
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
 
   
        %>
    </body>
</html>
