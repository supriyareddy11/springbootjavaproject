package xv.training.springbootkalyan1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xv.training.springbootkalyan1.entities.Organization;
import xv.training.springbootkalyan1.entities.Student;
import xv.training.springbootkalyan1.repositories.OrganizationRepository;
import xv.training.springbootkalyan1.repositories.StudentRepository;

@SpringBootApplication
public class Springbootkalyan1Application {
	@Autowired
	private OrganizationRepository organizationRepository;

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Springbootkalyan1Application.class, args);
		System.out.println("hi");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			Organization organization1 = new Organization("Delhi University", "Delhi University");
			Organization organization2 = new Organization("Karnatak University", "Karnatak University");

			organizationRepository.save(organization1);
			organizationRepository.save(organization2);

			studentRepository.save(new Student("kalyan", "m", "btech", 21, organization1));
			studentRepository.save(new Student("lia", "m", "btech", 21, organization1));
			studentRepository.save(new Student("karthik", "f", "btech", 24, organization1));
			studentRepository.save(new Student("kama", "m", "btech", 21, organization1));

		};

	}
}
