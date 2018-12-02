<%-- 
    Document   : loginwelcome
    Created on : 15 Nov, 2018, 9:30:01 AM
    Author     : HP
--%>


<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            try{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            String myurl="jdbc:mysql://localhost/carpool";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from register where email='"+username+"' and password='"+password+"'";
                ResultSet rs=st.executeQuery(query1);
                
            if(rs.next())
                //out.println("welcome "+ username+" to this website");
        out.println("<script>alert('welcome "+ username+" to this website');setTimeout(function(){window.location='2newpage.html'})</script>");    
                else
                 out.println("not found");
                st.close();
            }
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
 
   
        %>
    </body>
   
</html>