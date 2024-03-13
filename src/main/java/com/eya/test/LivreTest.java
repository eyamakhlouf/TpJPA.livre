package com.eya.test;
import com.eya.dao.LivreDao;
import com.eya.entities.Livre;
public class LivreTest {
public static void main(String[] args) {
//créer un objet client
Livre l = new Livre();
l.setTitre_livre("les miserebles");
l.setAuteur("victor hugo");
l.setPrix(120);
l.setGenre("Drame");
l.setNb_pages(200);

//ajouter l'objet client à la BD
LivreDao livDao = new LivreDao();
livDao.ajouter(l);
System.out.println("Appel de la méthode listerTous");
for (Livre li : livDao.listerTous())
System.out.println(li.getTitre_livre()+" "+li.getAuteur()+" "+li.getPrix()+" "+li.getGenre()+" "+li.getNb_pages());
System.out.println("Appel de la méthode listerParNom");
for (Livre li : livDao.listerParTitre_Livre("les"))

System.out.println(li.getTitre_livre()+" "+li.getAuteur()+" "+li.getPrix()+" "+li.getGenre()+" "+li.getNb_pages());

//tester les autres méthodes de la classe ClientDao
Livre LivreaModifier =livDao.listerParTitre_Livre("les miserebles").get(0);

// Modification du livre récupéré
if (LivreaModifier != null) {
	LivreaModifier.setTitre_livre("causette");
	livDao.modifier(LivreaModifier);
    System.out.println("Livre modifié avec succès");
} else {
    System.out.println("Livre avec le nom spécifié non trouvé");
}


System.out.println("Appel de la méthode listerTous après modification :");
for (Livre li : livDao.listerTous())
	System.out.println(li.getTitre_livre()+" "+li.getAuteur()+" "+li.getPrix()+" "+li.getGenre()+" "+li.getNb_pages());
}
/*String titre_livre_a_supprimer = "les miserables";
System.out.println("Recherche et suppression du livre avec le titre : " + titre_livre_a_supprimer+" ");
for (Livre li : livreDao.listerParTitre_Livre(titre_livre_a_supprimer)) {
    System.out.println("Livre trouvé : " + li.getTitre_livre() + " " + li.getAuteur() + " " + li.getPrix() + " " + li.getGenre() + " " + li.getNb_pages());
    livreDao.supprimer(li);
    System.out.println("Livre supprimé avec succès de la base de données");
}*/

}
