<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Liste des clients existants</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="./css/bootstrap.css"/>" />
    </head>
    <body>
        <div id="corps">
        <c:choose>
            <%-- Si aucun client n'existe en session, affichage d'un message par défaut. --%>
            <c:when test="${ empty sessionScope.clients }">
                <p class="erreur">Aucun client enregistré.</p>
            </c:when>
            <%-- Sinon, affichage du tableau. --%>
            <c:otherwise>
            <table>
                <tr>
                    <th>Nom</th>
                    <th>Prénom</th>
        
                    <th>Email</th>
                    <th class="action">Action</th>                    
                </tr>
                <%-- Parcours de la Map des clients en session, et utilisation de l'objet varStatus. --%>
                <c:forEach items="${ sessionScope.clients }" var="mapClients" varStatus="boucle">
                <%-- Simple test de parité sur l'index de parcours, pour alterner la couleur de fond de chaque ligne du tableau. --%>
                <tr class="${boucle.index % 2 == 0 ? 'pair' : 'impair'}">
                    <%-- Affichage des propriétés du bean Client, qui est stocké en tant que valeur de l'entrée courante de la map --%>
                    <td><c:out value="${ mapClients.value.nom }"/></td>
                    <td><c:out value="${ mapClients.value.prenom }"/></td>
                    <td><c:out value="${ mapClients.value.mail }"/></td>

                  
                </tr>
                </c:forEach>
            </table>
            </c:otherwise>
        </c:choose>
        </div>
        <form name="retouraccueil" action="Controller" method= "post"> 
<input class="btn btn-primary btn-lg" type="submit" value="<fmt:message key="Retour acceuil"></fmt:message>"></td> 

</form> 
    </body>
</html>