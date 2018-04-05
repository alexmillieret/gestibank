<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.css" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ouverture de compte</title>
<c:import url="header.jsp" />
</head>
<body>
	<div>
		<form class="form-horizontal">
			<fieldset>

				<legend>Ouverture de compte</legend>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfnom">Nom : </label>
					<div class="col-md-6">
						<input id="txtfnom" name="txtfnom" type="text" placeholder="Nom"
							class="form-control input-md" required="">

					</div>
				</div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfprenom">Pénom
						: </label>
					<div class="col-md-6">
						<input id="txtfprenom" name="txtfprenom" type="text"
							placeholder="Pénom" class="form-control input-md" required="">

					</div>
				</div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfmail">Adresse
						e-mail : </label>
					<div class="col-md-6">
						<input id="txtfmail" name="txtfmail" type="text"
							placeholder="Adresse e-mail" class="form-control input-md"
							required="">

					</div>
				</div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfnumrue">Numéro
						de rue : </label>
					<div class="col-md-6">
						<input id="txtfnumrue" name="txtfnumrue" type="text"
							placeholder="n° rue" class="form-control input-md">

					</div>
				</div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfrue">Rue : </label>
					<div class="col-md-6">
						<input id="txtfrue" name="txtfrue" type="text" placeholder="Rue"
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group row text-right fcrea ">
					<label class="col-md-2 control-label" for="txtfcodpo">Code
						postal : </label>
					<div class="col-md-6">
						<input id="txtfcodpo" name="txtfcodpo" type="text" placeholder=""
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right ">
					<label class="col-md-2 control-label" for="txtfville">Ville
						: </label>
					<div class="col-md-6">
						<input id="txtfville" name="txtfville" type="text"
							placeholder="Ville" class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right">
					<label class="col-md-2 control-label" for="selectbasic">Pays
						: </label>
					<div class="col-md-6">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="1">France</option>
							<option value="2">Option two</option>
							<option value="3">Option two</option>
						</select>
					</div>
				</div>

				<div class="form-group fcrea row text-right">
					<label class="col-md-2 control-label" for="txtfnbenf">Nombre
						d'enfant(s) : </label>
					<div class="col-md-1">
						<input id="txtfnbenf" name="txtfnbenf" type="text" placeholder=""
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right ">
					<label class="col-md-2 control-label" for="radiofsitumari">Situation
						maritale : </label>
					<div class="col-md-4">
						<label class="radio-inline" for="radiofsitumari-0"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-0"
							value="1" checked="checked"> Célibataire
						</label> <label class="radio-inline" for="radiofsitumari-1"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-1"
							value="2"> Marié(e) - Pacsé(e)
						</label> <label class="radio-inline" for="radiofsitumari-2"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-2"
							value="3"> Veuf / Veuve
						</label>
					</div>
				</div>

			</fieldset>

			<fieldset>

				<div class="form-group">

					<div class="col-md-10 text-center">
						<button id="button1id" name="button1id" class="btn btn-success">Valider</button>
						<button id="button2id" name="button2id" class="btn btn-danger">Annuler</button>
					</div>
				</div>

			</fieldset>

		</form>
	</div>

	<c:import url="footer.jsp" />
</body>

</html>