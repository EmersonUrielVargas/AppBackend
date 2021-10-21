package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd.models.Users;

public interface UsersDAO extends JpaRepository<Users, Long> {

	@Query(nativeQuery = true, value = "SELECT* FROM users WHERE user_id = ?1")
	Users userById(Long id);

}
