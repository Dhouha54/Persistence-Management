package Domaine;
import javax.persistence.*;

@Entity
@Table(name="employee")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Employe extends Personne{
	@Column(name = "salaire")
	int salaire ;
	public Employe() {
		super();
	}
	
	public Employe(int salaire,long id, String nom) {
		super(id,nom);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
}

