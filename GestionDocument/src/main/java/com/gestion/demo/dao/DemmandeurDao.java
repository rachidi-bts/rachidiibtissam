package com.gestion.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.demo.bean.Demmandeur;
import com.gestion.demo.bean.Filiere;


@Repository
 public interface DemmandeurDao extends JpaRepository<Demmandeur,Long> {


	 public Demmandeur findByFiliere(Filiere filiere);

	 public int deleteByFiliere(Filiere filiere);
	 
	 public Demmandeur findByCne(String cne);
		
	 public Demmandeur findByCodeApogee(String codeApogee);
		
	 public Demmandeur findByNom(String nom);
		
	 public Demmandeur findByCin(String cin);

	 public int deleteByCne(String cne);			

}
		