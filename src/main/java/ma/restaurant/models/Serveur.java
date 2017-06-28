package ma.restaurant.models;

public class Serveur extends Personne {
	private Double salaire;

	public Serveur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serveur(String nom, String prenom, String tel, String adresse, String mdp, String email,Double salaire) {
		super(nom, prenom, tel, adresse, mdp, email);
		this.salaire = salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	

}
