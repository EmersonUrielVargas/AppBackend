package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao.VendorsDAO;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Vendors;

@RestController // esta es una clase REST
@RequestMapping("vendors")
public class VendorsAPI {

	@Autowired // inyecta la dependencia de todos los métodos del JPA para usuarioDAO
	private VendorsDAO vendorsDAO;

	@PostMapping("/saveVendor") // Request convierte en un objeto Java desde un JSon
	public void saveVendor(@RequestBody Vendors vendor) {
		vendorsDAO.save(vendor);
	}

	@GetMapping("/verifyVendor/{nit}")
	public boolean verifyVendor(@PathVariable("nit") Long nit) {
		return vendorsDAO.existsById(nit);
	}

	@GetMapping("/listVendors")
	public List<Vendors> listVendors() {
		return vendorsDAO.findAll();
	}

	@GetMapping("/showVendor/{nit}")
	public Vendors getById(@PathVariable("nit") Long nit) {
		return vendorsDAO.getById(nit);
	}

	@DeleteMapping("/deleteVendor/{nit}")
	public void deleteVendor(@PathVariable("nit") Long nit) {
		vendorsDAO.deleteById(nit);

	}

	@PutMapping("/updateVendor")
	public void updateVendor(@RequestBody Vendors vendor) {
		vendorsDAO.save(vendor);
	}
}