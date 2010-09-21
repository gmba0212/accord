/**
 * Neociclo Accord, Open Source B2B Integration Suite
 * Copyright (C) 2005-2010 Neociclo, http://www.neociclo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id$
 */
package org.neociclo.odetteftp.examples.support;

import java.io.IOException;

import org.neociclo.odetteftp.security.OneToOneHandler;
import org.neociclo.odetteftp.security.PasswordAuthenticationCallback;
import org.neociclo.odetteftp.security.PasswordAuthenticationCallback.AuthenticationResult;

/**
 * @author Rafael Marins
 * @version $Rev$ $Date$
 */
public abstract class PasswordAuthenticationHandler implements OneToOneHandler<PasswordAuthenticationCallback> {

	public PasswordAuthenticationHandler() {
		super();
	}

	public void handle(PasswordAuthenticationCallback cb) throws IOException {

		AuthenticationResult result = authenticate(cb.getUser(), cb.getPassword());
		cb.setResult(result);

	}

	public abstract AuthenticationResult authenticate(String user, String password) throws IOException;

}