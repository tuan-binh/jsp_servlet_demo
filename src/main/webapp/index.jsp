<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action="<%=request.getContextPath()%>/calculate-servlet" method="post">
  <p>Mô tả:</p>
  <textarea name="desc" cols="30" rows="10"></textarea>
  <p>Price:</p>
  <input type="number" name="price">
  <p>Discount:</p>
  <input type="text" name="discount">
  <input type="submit" value="CALCULATE">
</form>
<h1></h1>
</body>
</html>