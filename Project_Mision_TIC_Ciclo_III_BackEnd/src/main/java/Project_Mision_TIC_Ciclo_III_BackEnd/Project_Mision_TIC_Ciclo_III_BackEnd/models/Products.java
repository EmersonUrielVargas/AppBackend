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
public class Products {
	
	@Id
	private long product_id;
	private double iva_buy;
	@ManyToOne
	@JoinColumn(name = "vendor_nit")
	private Vendors vendor_nit;
	
	private String product_name;
	private double price_buy;
	private double price_sale;
	/*@OneToMany
	@JoinColumn(name = "product_id")
	private List<Detail_sells> details_sales;*/
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public double getIva_buy() {
		return iva_buy;
	}
	public void setIva_buy(double iva_buy) {
		this.iva_buy = iva_buy;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice_buy() {
		return price_buy;
	}
	public void setPrice_buy(double price_buy) {
		this.price_buy = price_buy;
	}
	public double getPrice_sale() {
		return price_sale;
	}
	public void setPrice_sale(double price_sale) {
		this.price_sale = price_sale;
	}
	public Vendors getVendor_nit() {
		return vendor_nit;
	}
	public void setVendor_nit(Vendors vendor_nit) {
		this.vendor_nit = vendor_nit;
	}
	
	
	

}
