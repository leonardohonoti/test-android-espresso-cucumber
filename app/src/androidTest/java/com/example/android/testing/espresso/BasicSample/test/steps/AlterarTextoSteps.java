package com.example.android.testing.espresso.BasicSample.test.steps;

import androidx.test.core.app.ActivityScenario;

import com.example.android.testing.espresso.BasicSample.MainActivity;
import com.example.android.testing.espresso.BasicSample.test.page.AtividadePrincipalPage;
import com.example.android.testing.espresso.BasicSample.test.page.MostrarTextoDeAtividadePage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlterarTextoSteps {

    AtividadePrincipalPage paginaPrincipal = new AtividadePrincipalPage();
    MostrarTextoDeAtividadePage mostrarPaginaAtividade = new MostrarTextoDeAtividadePage();

    @Dado("que eu abro a atividade principal")
    public void queEuAbroAAtividadePrincipal() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Quando("eu digito {string} no campo de entrada")
    public void euDigitoNoCampoDeEntrada(String texto) {
        paginaPrincipal.digitarTextoCampoEntrada(texto);
    }

    @E("eu pressiono o botão de mudar texto")
    public void euPressionoOBotãoDeMudarTexto() {
        paginaPrincipal.pressionarBotaoAlterarTexto();
    }

    @Então("eu vejo o texto {string} exibido")
    public void euVejoOTextoExibido(String textoEsperado) {
        paginaPrincipal.verificarTextoAlterado(textoEsperado);
    }

    @E("eu pressiono o botão de mudar texto da nova atividade")
    public void euPressionoOBotãoDeMudarTextoDaNovaAtividade() {
        paginaPrincipal.pressionarBotaoAlterarTextoAtividade();
    }

    @Então("eu vejo o texto {string} na nova tela")
    public void euVejoOTextoNaNovaTela(String textoEsperado) {
        mostrarPaginaAtividade.checkTextDisplayed(textoEsperado);
    }

    @Então("a mensagem de erro {string} deve ser exibida")
    public void aMensagemDeErroDeveSerExibida(String msgErro) {
        paginaPrincipal.msgCampoObrigatorio(msgErro);
    }
}
