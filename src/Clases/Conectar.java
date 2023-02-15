/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
/**
 *
 * @author Alejandro
 */
public class Conectar {
     Connection Conectar = null ;
     public Connection conexion () {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             Conectar=DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_Carbon","root","");
         } catch (Exception e) {
             System.out.print(e.getMessage());
         }
         return Conectar ;
     }
}
