package com.pgy.business;

import com.pgy.dataaccess.UsuarioDA;

public class Usuario {
    private String rut;
    private String contrasenna;
    
    public Usuario (){
    }

    public Usuario(String rut, String contrasenna) {
        this.rut = rut;
        this.contrasenna = contrasenna;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
     public boolean autenticar (){
        UsuarioDA usuarioDA = new UsuarioDA();
        return usuarioDA.validarUsuario(this.rut, this.contrasenna);
 }  
}
