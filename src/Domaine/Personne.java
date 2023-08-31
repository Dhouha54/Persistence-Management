package Domaine;
import javax.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy=InheritanceType.JOINED)
public class Personne {
	@Id
	@Column(name = "PERSON_ID")
	private long id ;
	@Column(name = "PERSON_NOM")
	String nom  ;
	public Personne() {}
	public Personne(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
