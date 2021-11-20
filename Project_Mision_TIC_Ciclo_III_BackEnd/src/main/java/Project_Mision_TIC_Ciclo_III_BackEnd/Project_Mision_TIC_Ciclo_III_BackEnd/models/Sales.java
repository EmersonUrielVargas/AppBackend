package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Sales {
	@Id
	private long sale_id;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Clients client_id;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user_id;
	private double iva_sale;
	private double total_sale;
	private double value_sale;
	/*@OneToMany
	@JoinColumn(name = "sale_id")
	private List<Detail_sells> details_sales;_*/
	
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getSale_id() {
		return sale_id;
	}
	public void setSale_id(long sale_id) {
		this.sale_id = sale_id;
	}
	public Clients getClient_id() {
		return client_id;
	}
	public void setClient_id(Clients client_id) {
		this.client_id = client_id;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public double getIva_sale() {
		return iva_sale;
	}
	public void setIva_sale(double iva_sale) {
		this.iva_sale = iva_sale;
	}
	public double getTotal_sale() {
		return total_sale;
	}
	public void setTotal_sale(double total_sale) {
		this.total_sale = total_sale;
	}
	public double getValue_sale() {
		return value_sale;
	}
	public void setValue_sale(double value_sale) {
		this.value_sale = value_sale;
	}
	
	
	

}
