package tn.esprit.examen.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.Entities.Classe;
import tn.esprit.examen.Entities.Utilisateur;
import tn.esprit.examen.ServiceExam.IServiceExam;

@RestController
@AllArgsConstructor
public class ExameController {
    private IServiceExam iServiceExam;


    @PostMapping("/addUtilisateur")
    Utilisateur ajouterutilisateur(@RequestBody Utilisateur utilisateur){
        return iServiceExam.ajouterUtilisateur(utilisateur);
    }

    @PostMapping("/addClasse")
    Classe ajouterClasse(@RequestBody Classe c){
       return iServiceExam.ajouterClasse(c);
    }
}
