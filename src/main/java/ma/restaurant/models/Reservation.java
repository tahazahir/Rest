package ma.restaurant.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Reservation {
private Long idReservation;
private String dateReservation;
private String temps;
private int nbrPersonne;
private Facture factures;
private Client clients;
private Table tables;
private Set<Plat> plats = new HashSet<Plat>();

public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}
public Reservation(String dateReservation, String temps, int nbrPersonne, Facture factures, Client clients, Table tables) {
	super();
	this.dateReservation = dateReservation;
	this.temps = temps;
	this.nbrPersonne = nbrPersonne;
	this.factures = factures;
	this.clients = clients;
	this.tables = tables;
}







public Long getIdReservation() {
	return idReservation;
}

public void setIdReservation(Long idReservation) {
	this.idReservation = idReservation;
}



public String getDateReservation() {
	return dateReservation;
}







public void setDateReservation(String dateReservation) {
	this.dateReservation = dateReservation;
}







public String getTemps() {
	return temps;
}

public void setTemps(String temps) {
	this.temps = temps;
}



public int getNbrPersonne() {
	return nbrPersonne;
}



public void setNbrPersonne(int nbrPersonne) {
	this.nbrPersonne = nbrPersonne;
}



public Set<Plat> getPlats() {
	return plats;
}

public void setPlats(Set<Plat> plats) {
	this.plats = plats;
}



public Facture getFactures() {
	return factures;
}



public void setFactures(Facture factures) {
	this.factures = factures;
}







public Client getClients() {
	return clients;
}







public void setClients(Client clients) {
	this.clients = clients;
}







public Table getTables() {
	return tables;
}







public void setTables(Table tables) {
	this.tables = tables;
}








}
