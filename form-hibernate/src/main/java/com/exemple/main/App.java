package com.exemple.main;

import org.hibernate.Transaction;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.exemple.entities.Enseignant;
import com.exemple.entities.Etudiant;
import com.exemple.entities.Personne;
import com.exemple.entities.Sport;
import com.exemple.entities.Voiture;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projetfilrouge.User;

public class App {
	public static void main(String[] args) {
		// créer un objet de configuration hibernate
		Configuration configuration = new Configuration();

		// utiliser cet objet pour charger le fichier de config hibernate.cfg.xml
		configuration.configure();
		// crééer une usine de gestionnaire d'entite
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// créer un gestionnaire d'entite
		Session session = sessionFactory.openSession();
		// demmarer une transaction
		Transaction transaction = session.beginTransaction();
		
		
		// use le gestionnaire	pour persister les données
		
		// Voitures

		Voiture v1 = new Voiture("Marque2Merde", "Modele2Ouf", "couleur2Con");
		
		Voiture v2 = new Voiture();
		
		Voiture v3 = new Voiture();
		
		Voiture v4 = new Voiture();
		v4.setMarque("BMW");
		v4.setCouleur("bleue");
		v4.setModele("z3");
		
		Voiture v5 = new Voiture();
		v5.setCouleur("rouge");
		
		Voiture v6 = new Voiture();
		v6.setMarque("TOYOTA");
		v6.setCouleur("verte");
					
		// Sports
		
		Sport sport = new Sport("tennis","de table");
		Sport sport1 = new Sport("echec","super golerie");
		Sport sport2 = new Sport("foot-ball","de rue");
		Sport sport3 = new Sport("gymnastique", "de chambre");
		
		// Etudiants
		
		Etudiant etu1 = new Etudiant("LEGEAIS", "Romuald", 19, "BTS",v2);
		etu1.addSport(sport3);
		etu1.addSport(sport2);
		Etudiant etudiant = new Etudiant();
		
		etudiant.setNom("Menvussa");
		etudiant.setPrenom("Gerard");
		etudiant.setNiveau("Master2");
		etudiant.setAge(22);
		etudiant.addVoiture(v4);
		etudiant.addVoiture(v6);
		
		// Enseignants
		
		Enseignant theNew = new Enseignant("Ferrari","Philippe",41,2400,v1);
		theNew.addSport(sport2);
		
		Enseignant moi1= new Enseignant("Bruneau", "Eric", 20, 1500, v6);
		moi1.addSport(sport1);
		
		Enseignant moi2= new Enseignant("Bruneau", "Yann", 15, 150, v2);
		moi2.addSport(sport);
		moi2.addSport(sport3);
		
		Enseignant enseignant = new Enseignant();
		enseignant.setNom("Talaron");
		enseignant.setPrenom("Delphine");
		enseignant.setAge(56);
		enseignant.addVoiture(v3);
		
		
		// Enregistrer dans la mémoire les modifications ( Attend un commit )
		
		session.persist(enseignant);
		session.persist(theNew);
		session.persist(etudiant);
		session.persist(etu1);
		session.persist(moi1);
		session.persist(moi2);
		session.persist(sport);
		session.persist(sport3);
		session.persist(sport2);
		session.persist(sport1);
		session.persist(v1);
		session.persist(v2);
		session.persist(v3);
		session.persist(v4);

		// equivalent à une requete INSERT
		//session.persist(v1);
		
		// utiliser save en lieu et place de persist pour recuperer la valeur de la cle primaire PK
		// exemple
		Long myPrimaryKey = (Long) session.save(etudiant);
		System.out.println(myPrimaryKey+": "+etudiant.getNom()+", "+etudiant.getPrenom());
//		session.persist(user);
//		System.out.println(cle);
		
		// chercher une voiture (avec load)
		// LAZY LOADING, on charge à la demande (première utilisation
		Voiture voitureAChercher = session.load(Voiture.class, 2L); // ici Voiture.class est l'entite
		System.out.println(voitureAChercher);
//		
		// chercher en mode EAGER LOADING (toutes les données sont chargées en une fois)
//		Voiture Voit3 = new Voiture();
		
		// pour supprimer
		//session.delete(Voit3);
		
//		Voit3.setMarque("LADA");
//		Voit3.setCouleur("rouge");
//		Voit3.setModele("SKODA");
//		System.out.println(Voit3);

		//session.flush();
		
		
		//Afficher la liste
		CriteriaQuery<Etudiant> liste = session.getCriteriaBuilder().createQuery(Etudiant.class);
		liste.from(Etudiant.class);
		List<Etudiant> etudiants = session.createQuery(liste).getResultList();
		
		CriteriaQuery<Personne> liste2 = session.getCriteriaBuilder().createQuery(Personne.class);
		liste2.from(Personne.class);
		List<Personne> personnes = session.createQuery(liste2).getResultList();
		
		CriteriaQuery<Enseignant> liste3 = session.getCriteriaBuilder().createQuery(Enseignant.class);
		liste3.from(Enseignant.class);
		List<Enseignant> enseignants = session.createQuery(liste3).getResultList();
		
		CriteriaQuery<Sport> liste4 = session.getCriteriaBuilder().createQuery(Sport.class);
		liste4.from(Sport.class);
		List<Sport> sports = session.createQuery(liste4).getResultList();
		
		CriteriaQuery<Voiture> liste5 = session.getCriteriaBuilder().createQuery(Voiture.class);
		liste5.from(Voiture.class);
		List<Voiture> voitures = session.createQuery(liste5).getResultList();

		
		System.out.println("***********************  liste de voitures ************************");
		// expression lambda
		voitures.forEach((v) -> System.out.println(v));
		
		System.out.println("*********************** liste des etudiants*************************");
		// deuxième expression lambda
		etudiants.forEach(System.out::println);
		System.out.println("************************ liste des personnes ************************");
		personnes.forEach(System.out::println);
		System.out.println("*********************** liste des enseignants *********************");
		enseignants.forEach(System.out::println);
		
		System.out.println("************************liste des sports ***********************");
		sports.forEach((v) -> System.out.println(v.getId()+": "+v.getLibelle()+", "+v.getDescription()));
		
		System.out.println("**********récupère les personnes qui font du "+sport2.getLibelle()+" *************");
		for (Personne pers:personnes) {
			if (pers.getSports().contains(sport2)) {
				String className = pers.getClass().getName();
				System.out.println(pers.getNom()+", "+pers.getPrenom()+": "+className.substring(className.lastIndexOf(".")+1)+" "+pers.getSports());
			}
		}
		
		System.out.println("*******************************************************************");

 		transaction.commit();

		session.close();
		sessionFactory.close();
	}
}
