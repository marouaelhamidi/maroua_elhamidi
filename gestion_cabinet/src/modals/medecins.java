package modals;

public class medecins {
private int id;
private int version;
private String titre;
private String Nom;
private String prenom;

public medecins(int id, int version, String titre, String nom, String prenom) {
	super();
	this.id = id;
	this.version = version;
	this.titre = titre;
	Nom = nom;
	this.prenom = prenom;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

}
