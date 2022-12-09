package padraoVisitor;

import padraoVisitor.nos.AtribuicaoNO;
import padraoVisitor.nos.VariavelRefNo;
import padraoVisitor.visitors.GeracaoCodigoVisitor;
import padraoVisitor.visitors.VerificandoTipoVisitor;

public class Main {

    public static void main(String [] args) {

        AtribuicaoNO no1 = new AtribuicaoNO();
        no1.setTipoAVariavel("String");
        no1.setTipoBExp("String");

        VariavelRefNo no2 = new VariavelRefNo();
        no2.setNomeVariavel("Nome da minha variavel");

        NoVisitor visitor1 = new VerificandoTipoVisitor();
        NoVisitor visitor2 = new GeracaoCodigoVisitor();

        no1.accept(visitor1);
        no2.accept(visitor1);

        no1.accept(visitor2);
        no2.accept(visitor2);
    }
}
