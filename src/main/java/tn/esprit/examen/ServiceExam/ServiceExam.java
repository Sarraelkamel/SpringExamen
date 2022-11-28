package tn.esprit.examen.ServiceExam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.Entities.Classe;
import tn.esprit.examen.Entities.Utilisateur;
import tn.esprit.examen.Repository.ClasseRepository;
import tn.esprit.examen.Repository.UtilisateurRepository;

@Service
@AllArgsConstructor
public class ServiceExam implements IServiceExam{

    private UtilisateurRepository utilisateurRepository;
    private ClasseRepository classeRepository;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);
    }
}
