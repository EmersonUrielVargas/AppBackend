package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao.ClientsDAO;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao.ProductsDAO;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Clients;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Products;

@RestController // esta es una clase REST
@RequestMapping("products")
public class ProductsAPI {
	
	@Autowired // inyecta la dependencia de todos los métodos del JPA para usuarioDAO
	private ProductsDAO productsDAO;
	
	@GetMapping("/listProducts")
	public List<Products> listClients() {
		return productsDAO.findAll();
	}
	
	@PostMapping("/saveProduct") // Request convierte en un objeto Java desde un JSon
	public void saveClient(@RequestBody Products product) {
		productsDAO.save(product);
	}
	


}
