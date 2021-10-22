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

import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao.UsersDAO;
import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Users;

@RestController // esta es una clase REST
@RequestMapping("users")
public class UsersAPI {

	@Autowired // inyecta la dependencia de todos los métodos del JPA para usuarioDAO
	private UsersDAO usersDAO;

	@PostMapping("/saveUser") // Request convierte en un objeto Java desde un JSon
	public void saveUser(@RequestBody Users usuarios) {
		usersDAO.save(usuarios);
	}

	@GetMapping("/verifyUser/{id}")
	public boolean verifyUser(@PathVariable("id") Long id) {
		return usersDAO.existsById(id);
	}

	@GetMapping("/listUsers")
	public List<Users> listUsers() {
		return usersDAO.findAll();
	}

	@GetMapping("/showUser/{id}")
	public Users getById(@PathVariable("id") Long id) {
		Users user = usersDAO.getById(id);
		return user;
	}

	@GetMapping("/checkAdmin")
	public Users getAdmin() {
		Users user = usersDAO.checkAdmin();
		return user;
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		usersDAO.deleteById(id);

	}

	@PutMapping("/updateUser")
	public void updateUser(@RequestBody Users usuarios) {
		usersDAO.save(usuarios);
	}
}