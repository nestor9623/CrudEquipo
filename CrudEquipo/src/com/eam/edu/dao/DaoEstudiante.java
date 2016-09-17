/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eam.edu.dao;


import com.eam.edu.entidades.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author 411pc20
 */
public class DaoEstudiante {
    
    private ArrayList<Estudiante> listadoEstudiantes;

    
   public int create(Estudiante e){
       Estudiante aux = find(e.getCedula());
       if(aux!=null){
           return 0;
       }
       listadoEstudiantes.add(e);
       return 1;
   }
   
   
   public Estudiante find(String cedula){
       for(Estudiante e:listadoEstudiantes){
           if(e.getCedula().equals(cedula)){
               return e;
           }
       }
       return null;
   }
   
   
   public boolean remove(String ced){
       return  listadoEstudiantes.remove(find(ced));
       
   }
   
   
   public boolean edit(Estudiante e){
       int pos = -1;
       for(int i=0;i<listadoEstudiantes.size();i++){
           if(listadoEstudiantes.get(i).getCedula().equals(e.getCedula())){
                pos = i;
                break;
           }
       }
       if(pos!=-1){
        
             listadoEstudiantes.set(pos, e);
             return true;
       }
       return false;
   }
   
   
   
    
    
    
}
