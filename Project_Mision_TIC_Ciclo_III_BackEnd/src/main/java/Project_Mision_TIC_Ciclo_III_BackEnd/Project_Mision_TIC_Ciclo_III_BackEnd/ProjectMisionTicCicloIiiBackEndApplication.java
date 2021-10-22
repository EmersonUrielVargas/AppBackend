package Project_Mision_TIC_Ciclo_III_BackEnd.Project_Mision_TIC_Ciclo_III_BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class ProjectMisionTicCicloIiiBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMisionTicCicloIiiBackEndApplication.class, args);
	}

}
