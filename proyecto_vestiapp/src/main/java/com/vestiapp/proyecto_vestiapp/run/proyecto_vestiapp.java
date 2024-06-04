package com.vestiapp.proyecto_vestiapp.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class proyecto_vestiapp {

	public static void main(String[] args) throws Exception {
		DBServer.start("proyecto_vestiapp-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("proyecto_vestiapp"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
