package modals;

public class client {
private int id;
private int version;
private int HDebut;
private int MDebut;
private int HFin;
private int Mfin;
private int ID_medecine;

public client(int id, int version, int hDebut, int mDebut, int hFin, int mfin, int iD_medecine) {
	super();
	this.id = id;
	this.version = version;
	HDebut = hDebut;
	MDebut = mDebut;
	HFin = hFin;
	Mfin = mfin;
	ID_medecine = iD_medecine;
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
public int getHDebut() {
	return HDebut;
}
public void setHDebut(int hDebut) {
	HDebut = hDebut;
}
public int getMDebut() {
	return MDebut;
}
public void setMDebut(int mDebut) {
	MDebut = mDebut;
}
public int getHFin() {
	return HFin;
}
public void setHFin(int hFin) {
	HFin = hFin;
}
public int getMfin() {
	return Mfin;
}
public void setMfin(int mfin) {
	Mfin = mfin;
}
public int getID_medecine() {
	return ID_medecine;
}
public void setID_medecine(int iD_medecine) {
	ID_medecine = iD_medecine;
}



}
