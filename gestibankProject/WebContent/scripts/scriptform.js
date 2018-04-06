//function validationLogin() {
//
//	if (verifObligatoire("txtfnom")) {
//		alert('Login manquant');
//		return false;
//	} else
//
//	if (verifObligatoire("txtfprenom")) {
//		alert('Prénom manquant');
//		return false;
//	} else {
//		return true;
//	}
//
//}
//
//
//

var formul = document.getElementById("formcrea");

formul.addEventListener("submit", function(e) {
	var err = false;
	// test de champ txNom
	// recup de l'objet Champ
	var oChamp = document.getElementById("txtfnom");
	// test si champ contient de l'info
	if (oChamp.value.length == 0) {
		// Message d'erreur
		document.getElementById("errNom").innerHTML = "Nom obligatoire !"
		err = true;
	}

	oChamp = document.getElementById("txtfprenom");
	// test si champ contient de l'info
	if (oChamp.value.length == 0) {
		// Message d'erreur
		document.getElementById("errPrenom").innerHTML = "Prénom obligatoire !"
		err = true;
	

	}

	oChamp = document.getElementById("txtfmail");
	// test si champ contient de l'info
	if (oChamp.value.length == 0) {
		// Message d'erreur
		document.getElementById("errMail").innerHTML = "Mail obligatoire !"
			err = true;
	}
	
	
	if (err) {// on empeche l'envoi du formulaire
		e.preventDefault();
	}
	
})
































