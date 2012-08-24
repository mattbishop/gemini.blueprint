/******************************************************************************
 * Copyright (c) 2006, 2010 VMware Inc., Oracle Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at 
 * http://www.eclipse.org/legal/epl-v10.html and the Apache License v2.0
 * is available at http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses. 
 * 
 * Contributors:
 *   VMware Inc.
 *   Oracle Inc.
 *****************************************************************************/

package org.eclipse.gemini.blueprint.iandt.cardinality0to1;

import java.io.FilePermission;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;

import org.eclipse.gemini.blueprint.iandt.BaseIntegrationTest;
import org.osgi.framework.AdminPermission;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundlePermission;
import org.osgi.framework.PackagePermission;
import org.osgi.framework.ServicePermission;
import org.eclipse.gemini.blueprint.iandt.cardinality0to1.test.MyListener;
import org.eclipse.gemini.blueprint.iandt.cardinality0to1.test.ReferenceContainer;
import org.eclipse.gemini.blueprint.service.ServiceUnavailableException;

public class Cardinality0to1Test extends BaseIntegrationTest {

	public void testSystemOutErr() throws Exception {

		assertNotNull("System.out should be not null", System.out);
		assertNotNull("System.err should be not null", System.err);

	}


}
