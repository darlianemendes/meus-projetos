package padraoVisitor;

import padraoVisitor.nos.AtribuicaoNO;
import padraoVisitor.nos.VariavelRefNo;

public abstract class NoVisitor {

    public abstract void visitAtribuicao(AtribuicaoNO n);
    public abstract void visitVariavelRef(VariavelRefNo n);
}
