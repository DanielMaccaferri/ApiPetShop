package br.com.petshop.steps;

import com.google.gson.Gson;

import br.com.petshop.pojos.Usuario;
import br.com.petshop.servicos.Resposta;
import br.com.petshop.servicos.ServicosImpl;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class UsuarioPetshopSteps {
	Usuario usuario = new Usuario();
	Gson gson = new Gson();
	ServicosImpl verbos = new ServicosImpl();
	Resposta validarAssercao = new Resposta();

	@Dado("^que eu realize uma requisicao na API para criar um usuario do petshop  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void que_eu_realize_uma_requisicao_na_API_para_criar_um_usuario_do_petshop(String id, String username, String firstname, String lastname, String email, String password, String phone, String userStatus)
			throws Throwable {	  
		usuario.setId(id);
		usuario.setUsername(username);
		usuario.setFirtsname(firstname);
		usuario.setLastname(lastname);
		usuario.setEmail(email);
		usuario.setPassword(password);
		usuario.setPhone(phone);
		usuario.setUserStatus(userStatus);

		String json = gson.toJson(usuario);
		verbos.postEndPoint("https://petstore.swagger.io/v2/user", json);
	}
	

	@Entao("^a API me retorna o status code (\\d+)$")
	public void a_API_me_retorna_o_status_code(Integer statusCode) throws Throwable {
		validarAssercao.getResposta().statusCode(statusCode).log().all();

	}

}
