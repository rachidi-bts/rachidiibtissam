package com.gestion.demo.ws ;


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

import com.gestion.demo.bean.Filiere;
import com.gestion.demo.service.facade.FiliereService;
import com.project.ws.rest.converter.FiliereConverter;
import com.project.ws.rest.vo.FiliereVo;
@RestController
@RequestMapping("/is/Filiere")
@CrossOrigin(origins = {"http://localhost:4200"})
public class FiliereRest {

 @Autowired 
 private FiliereService filiereService;

 @Autowired 
private FiliereConverter filiereConverter ;

@PostMapping("/")
public FiliereVo save(@RequestBody FiliereVo filiereVo){
Filiere filiere= filiereConverter.toItem(filiereVo);
return filiereConverter.toVo(filiereService.save(filiere));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
filiereService.deleteById(id);
}
@GetMapping("/")
public List<FiliereVo> findAll(){
return filiereConverter.toVo(filiereService.findAll());
}

 public FiliereConverter getFiliereConverter(){
return filiereConverter;
}
 
 public void setFiliereConverter(FiliereConverter filiereConverter){
this.filiereConverter=filiereConverter;
}

 public FiliereService getFiliereService(){
return filiereService;
}
 
 public void setFiliereService(FiliereService filiereService){
this.filiereService=filiereService;
}

}