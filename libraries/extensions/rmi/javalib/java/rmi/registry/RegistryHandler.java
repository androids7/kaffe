/*
 * Copyright (c) 1996, 1997, 1998, 1999
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution
 * of this file.
 */

package java.rmi.registry;

import java.rmi.RemoteException;
import java.rmi.UnknownHostException;

public interface RegistryHandler {

public Registry registryStub(String host, int port) throws RemoteException, UnknownHostException;

public Registry registryImpl(int port) throws RemoteException;

}
