package stepdefinitions;

import cucumber.api.java.it.Quando;
import cucumber.api.java.es.Dado;;
import cucumber.api.java.ca.Quan;
import cucumber.api.java.pt.Entao;
import util.Componentes;

//import cucumber.api.java.pt.Quando;
//import cucumber.api.java.pt.Dado;


public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário informar nome, sobrenome, sexo, comida, escolaridade e esporte")
    public void que_o_usuário_informar_nome_sobrenome_sexo_comida_escolaridade_esporte() {
        componentes.inicializar();
        componentes.testarNome();
        componentes.testarSobrenome();
        componentes.testarSexo();
        componentes.testarComida();
        componentes.testarEscolaridade();
        componentes.testarEsporte();

//          componentes.fecharNavegador();

    }

    @Quando("clicar em cadastrar")
    public void clicar_em_cadastrar() {
        componentes.testarCadastrar();
    }

    @Entao("os dados Laura devem ser validados no formulario nome")
    public void os_dados_Laura_devem_ser_validados_no_formulario_nome() {
        componentes.validarNome();
        componentes.fecharNavegador();
    }

    @Entao("os dados Prass devem ser validados no formulario sobrenome")
    public void os_dados_Prass_devem_ser_validados_no_formulario_sobrenome() {
        componentes.validarSobrenome();
        componentes.fecharNavegador();
    }

    @Entao("os dados Feminino devem ser validados no formulario sexo")
    public void os_dados_Feminino_devem_ser_validados_no_formulario_sexo() {
        componentes.validarSexo();
        componentes.fecharNavegador();
    }

    @Entao("os dados Carne devem ser validados no formulario comida")
    public void os_dados_Carne_devem_ser_validados_no_formulario_comida() {
        componentes.validarComida();
        componentes.fecharNavegador();
    }

    @Entao("os dados Superior devem ser validados no formulario escolaridade")
    public void os_dados_Superior_devem_ser_validados_no_formulario_escolaridade() {
        componentes.validarEscolaridade();
        componentes.fecharNavegador();
    }

    @Entao("os dados Karate devem ser validados no formulario esporte")
    public void os_dados_Karate_devem_ser_validados_no_formulario_esporte() {
        componentes.validarEsporte();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo nome")
    public void que_o_usuário_não_preencheu_nome() {
        componentes.inicializar();
    }

    @Quando("o usuário for se cadastrar")
    public void o_usuário_for_se_cadastrar(){
        componentes.testarCadastrar();
    }

    @Entao("retorna uma mensagem de erro falando que nome é Obrigatório")
    public void retorna_uma_mensagem_de_erro_falando_que_nome_é_Obrigatório(){
        componentes.validarAlerta();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo sobrenome")
    public void que_o_usuário_não_preencheu_o_campo_sobrenome(){
        componentes.inicializar();
        componentes.testarNomeObrigatorio();
    }

    @Quando("o user clicar em cadastrar")
    public void o_user_clicar_em_cadastrar(){
        componentes.testarCadastrar();
    }

    @Entao("retorna uma mensagem de erro falando que sobrenome é Obrigatório")
    public void retorna_uma_mensagem_de_erro_falando_que_sobrenome_é_Obrigatório(){
        componentes.validarAlerta();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo sexo")
    public void que_o_usuário_não_preencheu_o_campo_sexo(){
        componentes.inicializar();
        componentes.testarNome();
        componentes.testarSobrenome();
    }

    @Quando("dar um clique em cadastrar")
    public void dar_um_clique_em_cadastrar(){
        componentes.testarCadastrar();
    }

    @Entao("retorna uma mensagem de erro falando que sexo é Obrigatório")
    public void retorna_uma_mensagem_de_erro_falando_que_sexo_é_Obrigatório(){
        componentes.validarAlerta();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário acessou o arquivo Componentes.html")
    public void que_o_usuário_acessou_o_arquivo_Componentes_html(){
        componentes.inicializar();
    }

    @Quando("clicar no botão Clique Me! e depois no  Voltar")
    public void clicar_no_botão_Clique_Me_e_depois_no_Voltar(){
        componentes.testarBotaoCliqueMe();
    }

    @Entao("o elemento deve aparecer voltou!")
    public void o_elemento_deve_aparecer_voltou(){
        componentes.validarBotaoCliqueMe();
        componentes.fecharNavegador();
    }
}




