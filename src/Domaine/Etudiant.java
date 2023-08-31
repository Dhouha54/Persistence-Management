package Domaine;
import javax.persistence.*;
@Entity
@Table(name="student")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Etudiant extends Personne{
	@Column(name = "filiere")
	String filiere ;
	public Etudiant() {
		super();
	}
	public Etudiant(String filiere,long id, String nom) {
		super(id,nom);
		this.filiere = filiere;
	}

	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}	
}

