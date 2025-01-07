package com.pgy.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductoDA {
    
    //Recuperacion de datos
    public ResultSet get(int sku) {
        DBContext dbCtx = new DBContext();
        String st = "SELECT p.nombre_pdcto AS nombre, p.precio_pdcto AS precio, p.stock_disponible AS stock, c.nombre_categoria AS categoria " +
                    "FROM producto p " +
                    "INNER JOIN categoria_pdcto c ON p.id_categoria = c.id_categoria " +
                    "WHERE p.sku_pdcto = ?";
        ResultSet rs;
        try {
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setInt(1, sku);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }
}
