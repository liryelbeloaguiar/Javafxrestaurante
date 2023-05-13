package poo.restaurante;

import java.util.ArrayList;
import java.util.List;

public class FunkDAO {

    public List<Funcionario> listarFunk(){
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario func1 = new Funcionario("Liryel2",19, "9999999");
        Funcionario func2 = new Funcionario("Liryel",18, "7777777777");

        funcionarios.add(func1);
        funcionarios.add(func2);
        return funcionarios;
    }
}
