package util;

import org.junit.Assert;
import org.openqa.selenium.*;
//import org.openqa.selenium.edge.EdgeDriver;   <- eu tinha colocado para abrir no meu navegador Edge para testar tbm
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Componentes {

    private WebDriver driver;
    private Select combo;
    private List<WebElement> comboBoxOptions;
    private WebElement botao;
    private WebElement voltar;

    public void inicializar() {
        String chromeDriver = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/driver/componentes.html");
    }

    public void navegador(){
        Assert.assertTrue(driver.toString().contains("Chrome"));
    }

    public void fecharNavegador() {
        driver.quit();
    }

    public void testarNome() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Laura");
 //       fecharNavegador();

    }

    public void validarNome() {
    //    Assert.assertEquals("Laura", driver.findElement(By.id("descNome")).findElement(By.tagName("span")).getText());
        Assert.assertEquals("Laura", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testarSobrenome() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Prass");
    //    fecharNavegador();

    }

    public void validarSobrenome() {
    //    Assert.assertEquals("Prass", driver.findElement((By.id("descSobrenome"))).findElement(By.tagName("span")).getText());
        Assert.assertEquals("Prass",
                driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testarSexo() {
        driver.findElement(By.id("elementosForm:sexo:1")).click();
    //    fecharNavegador();
    }

    public void validarSexo() {
    //    Assert.assertEquals("Feminino", driver.findElement((By.id("descSexo"))).findElement(By.tagName("span")).getText());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
    }

    public void testarComida() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    //    fecharNavegador();
    }

    public void validarComida() {
    //    Assert.assertEquals("Carne", driver.findElement((By.id("descComida"))).findElement(By.tagName("span")).getText());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());

    }

    public void testarEscolaridade() {
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
    //    select = new Select(elemento);
    //    select.selectByIndex(4);
        Select elementoNew = new Select(elemento);
        elementoNew.selectByValue("superior");
    //    fecharNavegador();

    }

    public void validarEscolaridade() {
    //    Assert.assertEquals("superior", driver.findElement((By.id("descEscolaridade"))).findElement(By.tagName("span")).getText());
        WebElement elemento = driver.findElement(By.id("descEscolaridade"));
        String retorno = elemento.findElement(By.tagName("span")).getText();
        Assert.assertEquals("superior", retorno);
    }

    public void testarEsporte() {
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByIndex(3);

    //    fecharNavegador();
    }

    public void validarEsporte(){
        Assert.assertEquals("Karate", combo.getFirstSelectedOption().getText());
    }

    public void testarCadastrar(){
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }

    public void testarNomeObrigatorio() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("");
    }

   public void validarNomeObrigatorio() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Informar o NOME é obrigatório!!", alert.getText());
    }

    public void testarSobrenomeObrigatorio() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
    }

    public void validarSobrenomeObrigatorio() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Informar o SOBRRENOME é obrigatório!!", alert.getText());
    }

    public void testarSexoObrigatorio() {
//        driver.findElement(By.id("elementosForm:sexo:1"));
        driver.findElement(By.id("elementosForm:sexo:")).click();
    }

    public void validarSexoObrigatorio() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Informar o SEXO é obrigatório!!", alert.getText());
    }

    public void validarAlerta() {
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains(" é obrigatório!!"));
        alert.accept();
    }

    public void testarBotaoCliqueMe(){
        voltar = driver.findElement(By.linkText("Voltar"));
        voltar.click();

        botao = driver.findElement(By.id("buttonSimple"));
        botao.click();
    }

    public void validarBotaoCliqueMe(){
        Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
    }

}