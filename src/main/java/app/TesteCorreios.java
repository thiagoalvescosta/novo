package app;

import org.talesolutions.cep.CEPService;
import org.talesolutions.cep.CEPServiceFactory;

import cronapi.CronapiMetaData;
import cronapi.ParamMetaData;
import cronapi.Var;
import cronapi.CronapiMetaData.ObjectType;


/**
 * Descrição da Função ...
 * 
 * @author local
 * @version 1.0
 * @since 2017-11-09
 *
 */
 
@CronapiMetaData(categoryName = "Minhas Funções") 
public class TesteCorreios {

	@CronapiMetaData(type = "function", name = "Obter CEP", description = "Descrição da Função", returnType = ObjectType.STRING)
	public static Var buscarCEP(@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input) throws Exception {
     CEPService service = CEPServiceFactory.getCEPService();
     return Var.valueOf(service.obtemPorNumeroCEP(input.toString()).toString());
	}

}


