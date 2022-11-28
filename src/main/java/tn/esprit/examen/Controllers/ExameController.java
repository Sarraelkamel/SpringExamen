package tn.esprit.examen.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.Entities.Classe;
import tn.esprit.examen.Entities.CoursClassroom;
import tn.esprit.examen.Entities.Niveau;
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

    @PostMapping("/addcoursclassrrom/{codeClasse}")
    CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc, @PathVariable Integer codeClasse){
        return iServiceExam.ajouterCoursClassroom(cc,codeClasse);
    }

    @PostMapping("/affecterUtilisateurClasse/{idUtilisateur}/{codeClasse}")
    void affecterUtilisateurClasse(@PathVariable Integer  idUtilisateur,@PathVariable Integer codeClasse){
         iServiceExam.affecterUtilisateurClasse(idUtilisateur,codeClasse);

    }

    @GetMapping("/nbUtilisateurParNiveau")
    Integer nbUtilisateursParNiveau(Niveau nv){
        return iServiceExam.nbUtilisateursParNiveau(nv);
    }
}
