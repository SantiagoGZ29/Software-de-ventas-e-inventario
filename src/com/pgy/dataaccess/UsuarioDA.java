package com.pgy.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class UsuarioDA {

    public boolean validarUsuario(String rut, String contrasenna) {
        DBContext dbCtx = new DBContext();
        String query = "SELECT contrasena_usuario FROM USUARIO WHERE numrut_emp = ?";
        ResultSet rs = null;

        try (Connection conn = dbCtx.getConexion();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, rut);
            rs = pst.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("contrasena_usuario");
                return contrasenna.equals(storedPassword); // Comparación simple
            }
        } catch (SQLException ex) {
            System.out.println("Error al validar usuario: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar ResultSet: " + ex.getMessage());
            }
        }
        return false;
    }
}

