package projetoLoja;
import java.util.ArrayList;
import java.util.List;


public class ModelosColchoes {

    final String nomeModelo;
    final List<Conforto> confortos = new ArrayList<>();

    ModelosColchoes(String nome){
        this.nomeModelo = nome;
    }

    void adicionarConforto(Conforto confortos){
        this.confortos.add(confortos);
        confortos.modelosColchoes.add(this);
    }
}
