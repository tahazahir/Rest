package ma.restaurant.models;

public class Panier {
private Plat plats;
private int qte;
public Panier() {
	super();
	// TODO Auto-generated constructor stub
}
public Panier(Plat plats, int qte) {
	super();
	this.plats = plats;
	this.qte = qte;
}
public Plat getPlats() {
	return plats;
}
public void setPlats(Plat plats) {
	this.plats = plats;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}

}
