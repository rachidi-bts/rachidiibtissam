package com.gestion.demo.ws.provided ;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.demo.bean.Demmandeur;
import com.gestion.demo.service.facade.DemmandeurService;
import com.gestion.demo.ws.converter.DemmandeurConverter;
import com.gestion.demo.ws.vo.DemmandeurVo;
@RestController
@RequestMapping("GestionDocument/Demmandeur")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DemmandeurRest {

 @Autowired 
 private DemmandeurService demmandeurService;

 @Autowired 
private DemmandeurConverter demmandeurConverter ;

@PostMapping("/")
public DemmandeurVo save(@RequestBody DemmandeurVo demmandeurVo){
Demmandeur demmandeur= demmandeurConverter.toItem(demmandeurVo);
return demmandeurConverter.toVo(demmandeurService.save(demmandeur));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){ 
demmandeurService.deleteById(id);
}
@GetMapping("/")
public List<DemmandeurVo> findAll(){
	demmandeurConverter.init();
return demmandeurConverter.toVo(demmandeurService.findAll());
}

 public DemmandeurConverter getDemmandeurConverter(){
return demmandeurConverter;
}
 
 public void setDemmandeurConverter(DemmandeurConverter demmandeurConverter){
this.demmandeurConverter=demmandeurConverter;
}

 public DemmandeurService getDemmandeurService(){
return demmandeurService;
}
 
 public void setDemmandeurService(DemmandeurService demmandeurService){
this.demmandeurService=demmandeurService;
}
 
 @GetMapping("/cne/{cne}")
	public Demmandeur findByCne(@PathVariable String cne) {
		return demmandeurService.findByCne(cne);
	}

	@GetMapping("/codeApogee/{codeApogee}")
	public Demmandeur findByCodeApogee(@PathVariable String codeApogee) {
		return demmandeurService.findByCodeApogee(codeApogee);
	}

	@GetMapping("/nom/{nom}")
	public Demmandeur findByNom(@PathVariable String nom) {
		return demmandeurService.findByNom(nom);
	}

	@GetMapping("/cin/{cin}")
	public Demmandeur findByCin(@PathVariable String cin) {
		return demmandeurService.findByCin(cin);
	}

	@GetMapping("/filiere/abrv/{abrv}")
	public List<Demmandeur> findByFiliereAbrv(@PathVariable String abrv){
	return demmandeurService.findByFiliereAbrv(abrv);
	}
	
	@DeleteMapping("/cne/{cne}")
	public int deleteByCne(@PathVariable String cne) {
	return	demmandeurService.deleteByCne(cne);
		
	}

}