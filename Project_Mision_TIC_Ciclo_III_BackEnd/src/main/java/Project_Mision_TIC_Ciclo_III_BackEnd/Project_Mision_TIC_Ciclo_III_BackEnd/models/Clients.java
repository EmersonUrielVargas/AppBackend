package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Clients {

	@Id
	private long user_id;
	private String user_name;
	private String user_email;
	private String user;
	private String password;
	public Clients() {}
	public long getUser_id() {
		return user_id;
	}
}
