package ma.restaurant.models;

public class Message {
	Long idMessage;
	String email;
	String nom;
	String message;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String email, String nom, String message) {
		super();
		this.email = email;
		this.nom = nom;
		this.message = message;
	}
	public Long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
