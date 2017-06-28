package ma.restaurant.models;

import java.util.HashSet;
import java.util.Set;

public class Table {
	private Long idTable;
	private String numTable;
	private String capacite;
	private Boolean etat;
	private Serveur serveurs;
	
	
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Table(String numTable, String capacite, Boolean etat) {
		super();
		this.numTable = numTable;
		this.capacite = capacite;
		this.etat = etat;
		this.serveurs = serveurs;
			}

	public String getNumTable() {
		return numTable;
	}
	public void setNumTable(String numTable) {
		this.numTable = numTable;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	
	public Long getIdTable() {
		return idTable;
	}
	public void setIdTable(Long idTable) {
		this.idTable = idTable;
	}
	

	public Serveur getServeurs() {
		return serveurs;
	}

	public void setServeurs(Serveur serveurs) {
		this.serveurs = serveurs;
	}
	

}
