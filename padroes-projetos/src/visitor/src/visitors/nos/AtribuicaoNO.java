package padraoVisitor.nos;

import padraoVisitor.No;
import padraoVisitor.NoVisitor;

public class AtribuicaoNO extends No {

    private String tipoAVariavel;
    private String tipoBExp;

    @Override
    public void accept(NoVisitor v){
        v.visitAtribuicao(this);
    }

    public String getTipoAVariavel() {
        return tipoAVariavel;
    }

    public void setTipoAVariavel(String tipoAVariavel) {
        this.tipoAVariavel = tipoAVariavel;
    }

    public String getTipoBExp() {
        return tipoBExp;
    }

    public void setTipoBExp(String tipoBExp) {
        this.tipoBExp = tipoBExp;
    }
}
