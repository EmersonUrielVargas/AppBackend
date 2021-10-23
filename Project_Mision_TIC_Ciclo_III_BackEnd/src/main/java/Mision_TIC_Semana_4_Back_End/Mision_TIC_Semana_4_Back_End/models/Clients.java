package Mision_TIC_Semana_4_Back_End.Mision_TIC_Semana_4_Back_End.models;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Clients {
	@Id
	private long client_id;
	private String client_adress;
	private String client_email;
	private String client_name;
	private String client_telephone;
	
	public Clients() {
		super();
	}

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}

	public String getClient_adress() {
		return client_adress;
	}

	public void setClient_adress(String client_adress) {
		this.client_adress = client_adress;
	}

	public String getClient_email() {
		return client_email;
	}

	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_telephone() {
		return client_telephone;
	}

	public void setClient_telephone(String client_telephone) {
		this.client_telephone = client_telephone;
	}
	
}
