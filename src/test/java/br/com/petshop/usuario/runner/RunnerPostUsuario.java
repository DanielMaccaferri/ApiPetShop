package br.com.petshop.usuario.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"br.com.petshop.steps" }, features = {"src/test/resources/br/com/petshop/feature"}, tags = "@geral")
public class RunnerPostUsuario {

}
