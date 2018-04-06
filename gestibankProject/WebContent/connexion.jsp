<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
</head>
<body>
<c:import url="header.jsp" />

<form class="form-horizontal" method="post" action="<c:url value="/Connexion" />">
<fieldset>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="login"></label>  
  <div class="col-md-5">
  <input id="login" name="login" type="text" placeholder="Identifiant" class="form-control input-md" required="">
  <span class="erreur">${form.erreurs['login']}</span>
  <span class="help-block">Entrez votre nom d'utilisateur</span>  
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="password"></label>
  <div class="col-md-4">
    <input id="password" name="password" type="password" placeholder="Mot de passe" class="form-control input-md" required="">
    <span class="erreur">${form.erreurs['password']}</span>
    <span class="help-block">Entrez votre mot de passe</span>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="connexion"></label>
  <div class="col-md-4">
    <button id="connexion" name="connexion" class="btn btn-success">Connexion</button>
  </div>
</div>
 <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                
                <%-- Vérification de la présence d'un objet utilisateur en session --%>
                <c:if test="${!empty sessionScope.sessionUtilisateur}">
                    <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
                	<p class="succes">Vous êtes connecté(e) avec l'adresse : ${sessionScope.sessionUtilisateur.nomUtilisateur}</p>
                </c:if>
</fieldset>
</form>
<c:import url="footer.jsp" />
</body>
</html>