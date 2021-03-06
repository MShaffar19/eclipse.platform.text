/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text;


/**
 * Extension interface for {@link org.eclipse.jface.text.ITextViewer}.
 * Adds the ability to install tabs to spaces conversion.
 *
 * @since 3.3
 */
public interface ITextViewerExtension7 {

	/**
	 * Sets an auto edit strategy can converts tabs to spaces.
	 *
	 * @param converter the converter or <code>null</code> if none should be used
	 */
	void setTabsToSpacesConverter(IAutoEditStrategy converter);
}
