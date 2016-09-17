/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
   
   
   public int remove(String ced){
       return 0;
       
   }
   
   
   
    
    
    
}
