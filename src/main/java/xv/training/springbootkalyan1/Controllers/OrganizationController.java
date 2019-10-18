package xv.training.springbootkalyan1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.springbootkalyan1.entities.Organization;
import xv.training.springbootkalyan1.repositories.OrganizationRepository;

@RestController
public class OrganizationController {
	
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	@RequestMapping("/organizations")
	public Iterable<Organization> getOrganizations(){
		return organizationRepository.findAll();
	}

}
