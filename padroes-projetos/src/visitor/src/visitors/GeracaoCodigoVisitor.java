package padraoVisitor.visitors;

import padraoVisitor.NoVisitor;
import padraoVisitor.nos.AtribuicaoNO;
import padraoVisitor.nos.VariavelRefNo;

public class GeracaoCodigoVisitor extends NoVisitor {
    @Override
    public void visitAtribuicao(AtribuicaoNO n) {
        System.out.println(n.getTipoAVariavel() + "=" + n.getTipoBExp());
    }

    @Override
    public void visitVariavelRef(VariavelRefNo n) {
        System.out.println(n.getNomeVariavel());
    }
}
