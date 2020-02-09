package modals;

public class rv {

	public int id;
	public rv() {
		super();
	}
	public int jour;
	public int id_client;
	public int id_creneau;
	public rv(int id, int jour, int id_client, int id_creneau) {
		super();
		this.id = id;
		this.jour = jour;
		this.id_client = id_client;
		this.id_creneau = id_creneau;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public int getId_creneau() {
		return id_creneau;
	}
	public void setId_creneau(int id_creneau) {
		this.id_creneau = id_creneau;
	}
	
}