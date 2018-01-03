<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
        <h1 style="background-color: graytext;">Student Admission Form For Engineering Courses</h1>
        
         <form action="/SpringMVCModelAttribute/submitAdmissionForm.html" method="post">
         <p>
             student's Name:<input type="text" name="studentName">
         </p>
         <p>
             student's Hobby:<input type="text" name="studentHobby">
         </p>         
         <input type="submit" value="submit this form by clicking here">
         </form>
</body>
</html>