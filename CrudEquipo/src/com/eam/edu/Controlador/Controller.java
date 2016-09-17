/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eam.edu.Controlador;

import com.eam.edu.dao.DaoEstudiante;
import com.eam.edu.entidades.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author 411pc20
 */
public class Controller {
   
    private DaoEstudiante dao;
    
    
    
    
    public void crear(Estudiante e){
        int resultado= dao.create(e);
        
        if(resultado ==1){
            System.out.println("registro el estudiante");
        }
  
        
    }
    
    public  Estudiante buscar(String cedula){
        Estudiante es =dao.find(cedula);
                return es;
    }
    
    public boolean modificar(Estudiante e){
        boolean modificado;
       modificado= dao.edit(e);
       if(modificado ==true){
           System.out.println("SE MODIFICO");
           return true;
       }
       
       return false;
    }
    
    
    public boolean eliminar(String cedula){
       
        boolean eliminado;
        eliminado = dao.remove(cedula);
        
        if(eliminado == true){
            System.out.println("SE ELIMINO EL ESTUDIANTE");
            return true;
        }
        
        return false;
    }
    
    
}
