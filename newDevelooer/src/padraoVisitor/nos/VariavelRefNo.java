package padraoVisitor.nos;

import padraoVisitor.No;
import padraoVisitor.NoVisitor;

public class VariavelRefNo extends No {

    private String nomeVariavel;

    @Override
    public void accept(NoVisitor v){
        v.visitVariavelRef(this);
    }

    public String getNomeVariavel() {
        return nomeVariavel;
    }

    public void setNomeVariavel(String nomeVariavel) {
        this.nomeVariavel = nomeVariavel;
    }
}
