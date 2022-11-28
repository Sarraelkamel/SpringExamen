package tn.esprit.examen.ServiceExam;

import tn.esprit.examen.Entities.Classe;
import tn.esprit.examen.Entities.Utilisateur;

public interface IServiceExam {

    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);

    public Classe ajouterClasse (Classe c);
}
