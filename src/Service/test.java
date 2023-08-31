package Service;
import java.util.Iterator;
import java.util.List;
import java.util.List;  
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import Domaine.Employe;
import Domaine.Etudiant;
import Domaine.Personne;

public class test {

	public static void main(String[] args) {
		SessionFactory sessionf = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
			Session session = sessionf.openSession();
		session.beginTransaction();
		System.out.println("done");
		//create
		Personne p1 = new Personne();
		p1.setId(28);
		p1.setNom("doo");
		session.save(p1);
		
		//create
		Etudiant s1 = new Etudiant("informatique",123,"ali");
		session.save(s1);

		//create
		Employe e1 = new Employe(1000,231,"mohamed");
		session.save(e1);
		
		
		/*
		List list = session.createQuery("from student").list();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Etudiant e = (Etudiant)it.next();
			System.out.println("hello");
		}
		//read
		Etudiant e0 = (Etudiant)session.get(Etudiant.class, 50);
		System.out.println("Etudianrt "+e0.getNom());
		//update
		Etudiant e3 = new Etudiant(100,"layla");
		session.merge(e3);
		//delete
		Etudiant e5 = new Etudiant(32,"layla");
		session.delete(e5);
		
		*/
		session.getTransaction().commit();
	}

}
