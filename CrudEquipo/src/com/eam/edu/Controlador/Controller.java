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
   
    private DaoEstudiante dao = new DaoEstudiante();
    
    
    
    
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
    
    public void modificar(Estudiante e){
        boolean modificado;
       modificado= dao.edit(e);
       if(modificado ==true){
           JOptionPane.showMessageDialog(null,"DATOS MODIFICADOS");
           
       }else{
           JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR EL ESTUDIANTE","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       
      
    }
    
    
    public void eliminar(String cedula){
       
        boolean eliminado;
        eliminado = dao.remove(cedula);
        
        if(eliminado == true){
            JOptionPane.showMessageDialog(null,"estudiante eliminado");
            
        }else{
            JOptionPane.showMessageDialog(null,"error al eliminar el usuario","error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    
}
