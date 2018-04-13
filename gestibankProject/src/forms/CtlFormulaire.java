package forms;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilisateur.Client;

/**
 * Servlet implementation class CreationClientForm
 */
@WebServlet("/CtlFormulaire")
public class CtlFormulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String CHAMP_NOM       = "txtfnom";
    private static final String CHAMP_PRENOM    = "txtfprenom";
    private static final String CHAMP_NUMERO_RUE   = "txtfnumrue";
    private static final String CHAMP_RUE = "txtfrue";
    private static final String CHAMP_CODPO ="txtfcodpo";
    private static final String CHAMPS_VILLE = "txtfville";
    private static final String CHAMP_PAYS = "selectbasic";
    private static final String CHAMP_NB_ENFANT = "txtfnbenf";
    private static final String CHAMP_EMAIL     = "txtfmail";
    private static final String CHAMPS_SITUATION = "radiofsitumari";

    private String              resultat;
    private Map<String, String> erreurs         = new HashMap<String, String>();

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public Client creerClient( HttpServletRequest request ) {
        String nom = getValeurChamp( request, CHAMP_NOM );
        String prenom = getValeurChamp( request, CHAMP_PRENOM );
        String rue = getValeurChamp( request, CHAMP_RUE );
        String numRue = getValeurChamp( request, CHAMP_NUMERO_RUE );
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String codePostal = getValeurChamp( request, CHAMP_CODPO );
        String ville = getValeurChamp( request, CHAMPS_VILLE );
        String pays = getValeurChamp( request, CHAMP_PAYS );
        String nbEnfants = getValeurChamp( request, CHAMP_NB_ENFANT );
        String situation = getValeurChamp( request, CHAMPS_SITUATION );
        String nomUtilisateur=getValeurChamp( request, CHAMP_NOM );
        String password = "toto";
        Client client = new Client();

        try {
            validationNom( nom );
        } catch ( Exception e ) {
            setErreur( CHAMP_NOM, e.getMessage() );
        }
        client.setNom( nom );
        client.setCodePostal(codePostal);
        client.setNumRue(numRue);
        client.setRue(rue);
        client.setVille(ville);
        client.setNbEnfts(nbEnfants);
        client.setSituation(situation);
        client.setPays(pays);
        client.setNomUtilisateur(nomUtilisateur);
        client.setPassword(password);
        try {
            validationPrenom( prenom );
        } catch ( Exception e ) {
            setErreur( CHAMP_PRENOM, e.getMessage() );
        }
        client.setPrenom( prenom );

        try {
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
        }
        client.setMail( email );

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la création du client.";
        } else {
            resultat = "Échec de la création du client.";
        }

        return client;
    }

    private void validationNom( String nom ) throws Exception {
        if ( nom != null ) {
            if ( nom.length() < 2 ) {
                throw new Exception( "Le nom d'utilisateur doit contenir au moins 2 caractères." );
            }
        } else {
            throw new Exception( "Merci d'entrer un nom d'utilisateur." );
        }
    }

    private void validationPrenom( String prenom ) throws Exception {
        if ( prenom != null && prenom.length() < 2 ) {
            throw new Exception( "Le prénom d'utilisateur doit contenir au moins 2 caractères." );
        }
    }

    private void validationAdresse( String adresse ) throws Exception {
        if ( adresse != null ) {
            if ( adresse.length() < 10 ) {
                throw new Exception( "L'adresse de livraison doit contenir au moins 10 caractères." );
            }
        } else {
            throw new Exception( "Merci d'entrer une adresse de livraison." );
        }
    }

    private void validationTelephone( String telephone ) throws Exception {
        if ( telephone != null ) {
            if ( !telephone.matches( "^\\d+$" ) ) {
                throw new Exception( "Le numéro de téléphone doit uniquement contenir des chiffres." );
            } else if ( telephone.length() < 4 ) {
                throw new Exception( "Le numéro de téléphone doit contenir au moins 4 chiffres." );
            }
        } else {
            throw new Exception( "Merci d'entrer un numéro de téléphone." );
        }
    }

    private void validationEmail( String email ) throws Exception {
        if ( email != null && !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
            throw new Exception( "Merci de saisir une adresse mail valide." );
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
}