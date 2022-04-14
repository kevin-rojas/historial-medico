/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historial.medico;

import cliente.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author kevin
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<Cliente> tvTabla;
    @FXML
    private TableColumn<Cliente, String> dniTabla;
    @FXML
    private TableColumn<Cliente, String> fechaNTabla;
    @FXML
    private TableColumn<Cliente, String> nombreTabla;
    @FXML
    private TableColumn<Cliente, String> apellidoTabla;
    @FXML
    private TableColumn<Cliente, String> AtencionTabla;
    @FXML
    private Button agregarbtn;
    @FXML
    private TextField buscarTexfield;
    ObservableList <Cliente> clientes;
    private int posicionPersonaTabla;
    @FXML
    private Button buscarBtn;
    @FXML
    private TextField dniTF;
    @FXML
    private DatePicker fechaNacimientoDT;
    @FXML
    private TextField nombreTF;
    @FXML
    private TextField apelllidoTF;
    
    
   
   /* private void nuevo (ActionEvent event) {
        nombreTF.setText("");
        apelllidoTF.setText("");
        dniTF.setText("");
        fechaNacimientoDT.getValue();
        agregarbtn.setDisable(true);
        buscarBtn.setDisable(true);
    }*/
    
    @FXML
    private void agregar(ActionEvent event) {
        Cliente cliente =new Cliente();
        cliente.nombre.set(nombreTF.getText());
        cliente.apellido.set(apelllidoTF.getText());
        cliente.dni.set(dniTF.getText());
        cliente.fechanacimiento.set(fechaNacimientoDT.toString());
        clientes.add(cliente);
    }

    @FXML
    private void buscar(ActionEvent event) {
    }
    public  void mostrarTabla() {
      nombreTabla.setCellValueFactory(new PropertyValueFactory("nombreTF"));
      apellidoTabla.setCellValueFactory(new PropertyValueFactory("apellidotf"));
        
      
      //tvTabla.setItems(clientes);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarTabla();
      
    }
    
}
