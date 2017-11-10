package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// Bloco
	public static Var Executar(Var Dados) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.database.Operations.execute(Var.valueOf("app.entity.User"),
						Var.valueOf("update User set email = :email"),
						Var.valueOf("email", Var.valueOf("admin@admin")));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
