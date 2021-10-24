package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Detail_sales {
	
	@Id
	private long detail_sales_id;
	private int quantity_product;
	@ManyToOne
	@JoinColumn(name = "sale_id")
	private Sales sale_id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products product_id;
	private double total_value;
	private double total_sale;
	private double iva_value;
	public Detail_sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getDetail_sale_id() {
		return detail_sales_id;
	}
	public void setDetail_sale_id(long detail_sale_id) {
		this.detail_sales_id = detail_sale_id;
	}
	public int getQuantity_product() {
		return quantity_product;
	}
	public void setQuantity_product(int quantity_product) {
		this.quantity_product = quantity_product;
	}
	public Sales getSale_id() {
		return sale_id;
	}
	public void setSale_id(Sales sale_id) {
		this.sale_id = sale_id;
	}
	public Products getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Products product_id) {
		this.product_id = product_id;
	}
	public double getTotal_value() {
		return total_value;
	}
	public void setTotal_value(double total_value) {
		this.total_value = total_value;
	}
	public double getTotal_sale() {
		return total_sale;
	}
	public void setTotal_sale(double total_sale) {
		this.total_sale = total_sale;
	}
	public double getIva_value() {
		return iva_value;
	}
	public void setIva_value(double iva_value) {
		this.iva_value = iva_value;
	}
	
	


}
