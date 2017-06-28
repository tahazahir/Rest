package ma.restaurant.models;

import java.util.HashSet;
import java.util.Set;

import javax.sql.rowset.serial.SerialBlob;

public class Plat {
private Long idPlat;
private String genre;
private String designation;
private Double prix;
private String photo;

private Set<Reservation> reservations = new HashSet<Reservation>();
public Plat() {
	super();
	// TODO Auto-generated constructor stub
}


public Plat(String genre, String designation, Double prix, String photo) {
	super();
	this.genre = genre;
	this.designation = designation;
	this.prix = prix;
	this.photo = photo;
}




public Long getIdPlat() {
	return idPlat;
}
public void setIdPlat(Long idPlat) {
	this.idPlat = idPlat;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}


public Set<Reservation> getReservations() {
	return reservations;
}



public void setReservations(Set<Reservation> reservations) {
	this.reservations = reservations;
}


public String getPhoto() {
	return photo;
}


public void setPhoto(String photo) {
	this.photo = photo;
}




}
