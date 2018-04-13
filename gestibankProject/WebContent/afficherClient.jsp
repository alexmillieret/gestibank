	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <div id="corps">
            <p class="info">${ form.resultat }</p>
            <p>Nom : <c:out value="${ client.nom }"/></p>
            <p>Prénom : <c:out value="${ client.prenom }"/></p>
            <p>Numero de rue : <c:out value="${ client.numRue }"/></p>
           
            <p>Email : <c:out value="${ client.mail }"/></p>
        </div>
        <p><a href="<c:url value="/ListeClient"/>">Voir les clients existants</a></p>
</body>
</html>