package padraoVisitor.visitors;

import padraoVisitor.nos.AtribuicaoNO;
import padraoVisitor.NoVisitor;
import padraoVisitor.nos.VariavelRefNo;

public class VerificandoTipoVisitor extends NoVisitor {


    @Override
    public void visitAtribuicao(AtribuicaoNO n) {
        if(n.getTipoAVariavel().equals(n.getTipoBExp())){
            System.out.println("Sao Compativeis");
        } else{
            System.out.println("Sao Incompativeis");
        }
    }

    @Override
    public void visitVariavelRef(VariavelRefNo n) {
        System.out.println("Verificando tipo da variavel! Aqui ele nao faz nada.");
    }
}
