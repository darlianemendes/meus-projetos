package projetoLoja;

import java.util.ArrayList;
import java.util.List;

public class Conforto {

    final String nomeConforto;
    final List<ModelosColchoes> modelosColchoes = new ArrayList<>();

    Conforto(String nome){
        this.nomeConforto = nome;
    }

    void adicionarModelo(ModelosColchoes modelosColchoes){
        this.modelosColchoes.add(modelosColchoes);
        modelosColchoes.confortos.add(this);

    }

    ModelosColchoes obterModeloPorNome(String nome){
        for(ModelosColchoes modelosColchoes : this.modelosColchoes){
            if (modelosColchoes.nomeModelo.equalsIgnoreCase(nomeConforto)) {
                return modelosColchoes;
            }
        }
        return null;
    }

    public String toString(){
        return nomeConforto;
    }
}
