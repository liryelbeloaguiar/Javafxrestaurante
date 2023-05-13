package poo.restaurante;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ControllerPedidos {

    @FXML
    private TableView<?> tabelaPedidos;

    @FXML
    private TableColumn<?, ?> colunaMesa;

    @FXML
    private TableColumn<?, ?> colunaPedido;

    @FXML
    private TableColumn<?, ?> colunaGarcom;

    @FXML
    private TableColumn<?, ?> colunaHorario;

    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoEliminar;

    @FXML
    private TextArea textAreaComentarios;

    @FXML
    private Button botaoEditarPedido;

    @FXML
    private Button botaoFecharMesa;

    @FXML
    private Button botaoCozinha;

    @FXML
    private ComboBox<?> comboBoxPedidoAtual;

    @FXML
    private ComboBox<?> comboBoxGarcom;

    @FXML
    void editarPedido(ActionEvent event) {

    }

}
