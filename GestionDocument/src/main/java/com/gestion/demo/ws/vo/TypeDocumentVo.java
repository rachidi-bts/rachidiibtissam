package com.gestion.demo.ws.vo;

public class TypeDocumentVo{

private String id ;
private String libelle ;
private TypeFiliereVo typeFilliereVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getLibelle(){
    return libelle;
}

public void setLibelle(String  libelle){
     this.libelle = libelle;
}

public TypeFiliereVo  getTypeFilliereVo (){
    return typeFilliereVo ;
}

public void setTypeFilliereVo (TypeFiliereVo  typeFilliereVo ){
     this.typeFilliereVo  = typeFilliereVo ;
}


}