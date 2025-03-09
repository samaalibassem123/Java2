package Controllers;

import Model.Etudiant;

public interface IEtudiant {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    void deleteEtudiant(Etudiant e);
}
