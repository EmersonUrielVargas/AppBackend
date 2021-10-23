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

import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao.ClientsDAO;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Clients;

@RestController // esta es una clase REST
@RequestMapping("clients")
public class ClientsAPI {

	@Autowired // inyecta la dependencia de todos los métodos del JPA para usuarioDAO
	private ClientsDAO clientsDAO;

	@PostMapping("/saveClient") // Request convierte en un objeto Java desde un JSon
	public void saveClient(@RequestBody Clients client) {
		clientsDAO.save(client);
	}

	@GetMapping("/verifyClient/{id}")
	public boolean verifyClient(@PathVariable("id") Long id) {
		return clientsDAO.existsById(id);
	}

	@GetMapping("/listClients")
	public List<Clients> listClients() {
		return clientsDAO.findAll();
	}

	@GetMapping("/showClient/{id}")
	public Clients getById(@PathVariable("id") Long id) {
		Clients client = clientsDAO.getById(id);
		return client;
	}

	@DeleteMapping("/deleteClient/{id}")
	public void deleteClient(@PathVariable("id") Long id) {
		clientsDAO.deleteById(id);

	}

	@PutMapping("/updateClient")
	public void updateClient(@RequestBody Clients client) {
		clientsDAO.save(client);
	}
}