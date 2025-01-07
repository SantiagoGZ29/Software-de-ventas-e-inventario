
package com.pgy.business;

import com.pgy.dataaccess.ProductoDA;
import java.sql.ResultSet;

public class Producto {
    private String sku;
    private String nombre;
    private int precio;
    private String categoria;
    private int stock;
            
    public Producto (){
        
    }

    public Producto(String sku, String nombre, int precio, String categoria) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

//Metódo para la sentencia de recuperacion SELECT    
public Producto obtener(int codigo){
    ResultSet rs = new ProductoDA().get(codigo);
    if(rs != null){
        try{
            if(rs.next()){
                this.nombre = rs.getString("nombre");
                this.precio = rs.getInt("precio");
                this.categoria = rs.getString("categoria");
                this.stock = rs.getInt("stock");
                return this;
            } else {
                return null;
            }
        } catch(Exception ex){
            System.out.println("Error al recuperar el producto: " + ex.getMessage());
            return null;
        }
    } else {
        return null;
    }
}    
}
