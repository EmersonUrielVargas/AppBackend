package Mision_TIC_Semana_4_Back_End.Mision_TIC_Semana_4_Back_End.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Providers {
	
	@Id
	private long provider_nit;
	private String provider_city;
	private String provider_email;
	private String provider_name;
	private String provider_telephone;
	/*@OneToMany
	@JoinColumn(name = "provider_nit")
	private List<Products> products;
	*/
	public Providers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getProvider_nit() {
		return provider_nit;
	}
	public void setProvider_nit(long provider_nit) {
		this.provider_nit = provider_nit;
	}
	public String getProvider_adress() {
		return provider_city;
	}
	public void setProvider_adress(String provider_adress) {
		this.provider_city = provider_adress;
	}
	public String getProvider_email() {
		return provider_email;
	}
	public void setProvider_email(String provider_email) {
		this.provider_email = provider_email;
	}
	public String getProvider_name() {
		return provider_name;
	}
	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}
	public String getProvider_telephone() {
		return provider_telephone;
	}
	public void setProvider_telephone(String provider_telephone) {
		this.provider_telephone = provider_telephone;
	}
	
	

}
