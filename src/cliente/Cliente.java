/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author kevin
 */
public class Cliente {
    public SimpleStringProperty nombre=new SimpleStringProperty();
    public SimpleStringProperty apellido=new SimpleStringProperty();
    public SimpleStringProperty dni=new SimpleStringProperty();
    public SimpleStringProperty fechanacimiento=new SimpleStringProperty();

    public String getNombre() {
        return nombre.get();
    }

    public String getApellido() {
        return apellido.get();
    }

    public String getDni() {
        return dni.get();
    }

    public String getFechanacimiento() {
        return fechanacimiento.get();
    }

    
    
}
