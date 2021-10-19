package Mision_TIC_Semana_4_Back_End.Mision_TIC_Semana_4_Back_End.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Mision_TIC_Semana_4_Back_End.Mision_TIC_Semana_4_Back_End.models.Users;

public interface UsersDAO extends JpaRepository<Users, Long> {

	@Query(nativeQuery = true, value = " SELECT* FROM users WHERE user_id = ?1")
	Users userById(Long id);

}
