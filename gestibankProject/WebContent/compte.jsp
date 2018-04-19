<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comptes</title>
</head>
<body>
<div class="enteteEspaceClient">
<img id="logo4" src="images/logo2.png" alt="logo4" />
Gestion de vos comptes
</div>
		<div>
		<form method="post" action="">
   <p>
       <label for="compte">Liste de vos comptes :</label><br />
       <select name="compte" id="compte" size="x">
<c:forEach items="${sessionScope.sessionUtilisateur.getComptes()}" var="compte">
           <option value=""><c:out value="${compte.toString()}"></c:out></option>
           </c:forEach>
       </select>
   </p>
</form>
</div>
<c:import url="footer.jsp" />
</body>
</html>