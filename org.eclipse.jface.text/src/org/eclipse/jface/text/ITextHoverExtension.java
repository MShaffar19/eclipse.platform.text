/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
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
 * Extension interface for {@link org.eclipse.jface.text.ITextHover}.
 * <p>
 * It provides a way for hovers to specify the information control creator they
 * want to have used in order to create the hover control.</p>
 *
 * @see org.eclipse.jface.text.IInformationControlCreator
 * @see org.eclipse.jface.text.ITextHover
 * @since 3.0
 */
public interface ITextHoverExtension {

	/**
	 * Returns the hover control creator of this text hover or <code>null</code>
	 *
	 * @return the hover control creator or <code>null</code>
	 */
	IInformationControlCreator getHoverControlCreator();
}
