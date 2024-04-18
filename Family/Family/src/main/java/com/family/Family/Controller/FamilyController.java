package com.family.Family.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.Family.Service.FamilyService;
import com.family.Family.entity.Daughter;

@RestController
@RequestMapping("/Daughter")
public class FamilyController {

	@Autowired
	private FamilyService FamilyService;
	@PostMapping(value="/create")
	
  public Daughter createDaughter(@RequestBody Daughter Daughter)
  {
		FamilyService.saveuser(Daughter);
		
	return Daughter;	
		
  }
	
	
}
