<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css" />
<link href="./css/3_dark_grey/css/www_rate_calc_frame.css"
	rel="stylesheet" title="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Acceuil</title>
</head>
<body>
<c:import url="header.jsp" />
	<div class="row">
		<div class="offset-1 col-3" style ="text-align:center">
			<div id="powerd">
				<a href="https://www.transfermate.com/" target="_blank"
					id="tm_add146" class="tm_add146">Fournit par TransferMate</a>
			</div>
			<div id="demo-rate-convert"></div>
			<script>
				var apiTargetHtmlObj = document.getElementById("demo-rate-convert");
				var tmScript = document.createElement("script");
				tmScript.src = "https://www.transfermate.com/fr/exchange_rates_api.asp"; document.getElementsByTagName("head")[0].appendChild(tmScript);
			</script>
			<noscript>
				<br /> <span style="color: red;">Please enable your
					JavaScript.</span>
			</noscript>
</div>
<div class="col-8">
<div class="row">
			<div class="col-12" style ="text-align:center">
				<a class="btn btn-primary btn-lg" href="#" role="button">Devenir Client</a>
				</br>
				</br>
				</br>
				</br>
			</div>
			<div class="col-12" style ="text-align:center">
				<a class="btn btn-primary btn-lg" href="#" role="button">Se connecter</a>
			</div>
			</div>
		</div>
		</div>
		
<c:import url="footer.jsp" />
</body>
 

</html>