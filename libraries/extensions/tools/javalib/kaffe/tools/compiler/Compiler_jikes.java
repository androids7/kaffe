/*
 * Java core library component.
 *
 * Copyright (c) 1997, 1998, 1999
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution
 * of this file.
 */

package kaffe.tools.compiler;

import java.io.IOException;

public class Compiler_jikes
	extends Compiler {

final static private String jikespath = System.getProperty("kaffe.compiler.path", "/usr/local/bin/jikes");

public boolean compile(String name) {
	Process app = null;
	int exitcode;
	try {
		app = Runtime.getRuntime().exec(new String[]
			{ jikespath, "-classpath", System.getProperty("java.class.path", "."), name });
		app.waitFor();
	}
	catch (IOException e) {
	}
	catch (InterruptedException e) {
	}
	if (app == null) {
		exception = new Exception("Failed to start compiler");
	}
	else {
		int code = app.exitValue();
		if (code == 0) {
			return (true);
		}
		else {
			exception = new Exception("Exited with errorcode " + code);
		}
	}
	return (false);
}

}
