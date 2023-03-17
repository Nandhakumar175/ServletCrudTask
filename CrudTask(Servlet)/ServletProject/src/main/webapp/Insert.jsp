<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Details</title>
<style >form{width:100vw;padding:20px;display:flex;justify-content:center;}</style>
</head>
<body>
  
    <h2>Fill in the details</h2>
  
    <form action="./InsertDetails" method="post">
        <div style="background-color:#c3d3db;padding:20px;">
           <table align="center">
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" maxlength="30" size="25" /></td>
            </tr>
            <tr>
                <td>FatherName:</td>
                <td><input type="text" name="fatherName" maxlength="30" size="25" /></td>
            </tr>
           
            <tr />
             
            
             <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>Email:</td>
                <td><input type="text" name="email" maxlength="30" size="25" /></td>
            </tr>
            <tr />
             <tr>
                <td>City:</td>
                <td><input type="text" name="city" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>State:</td>
                <td><input type="text" name="state" maxlength="30" size="25" /></td>
            </tr>
            <tr />
            <tr>
                <td>Pincode:</td>
                <td><input type="text" name="pincode" maxlength="30" size="25" /></td>
            </tr>
            <tr />
        </table>
        
        <div style="text-align:center">
        <br /> <input type="submit" value="Insert Data" />
        <input type="button" value="Return to Home"
        onclick="window.location.href='Home.jsp'" /></div> 
  </div>
    </form>
    <br />
    
       
  
</body>
  
</html>