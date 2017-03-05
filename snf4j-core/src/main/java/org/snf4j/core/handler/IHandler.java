/*
 * -------------------------------- MIT License --------------------------------
 * 
 * Copyright (c) 2017 SNF4J contributors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * -----------------------------------------------------------------------------
 */
package org.snf4j.core.handler;

import org.snf4j.core.factory.ISessionStructureFactory;
import org.snf4j.core.session.ISession;
import org.snf4j.core.session.ISessionConfig;

/**
 * Handles events and I/O notifications sent from the associated session. It
 * also provides configuration and factories for the session.
 * 
 * @author <a href="http://snf4j.org">SNF4J.ORG</a>
 */
public interface IHandler {
	
	/**
	 * Sets the session that will be associated with this handler.
	 * 
	 * @param session
	 *            the session
	 */
	void setSession(ISession session);
	
	/**
	 * Returns the session that is associated with this handler.
	 * 
	 * @return the session
	 */
	ISession getSession();
	
	/**
	 * Returns the name of the handler. The name will be used to name the
	 * associated session created with the default constructor.
	 * 
	 * @return the name or <code>null</code> if the name is not specified.
	 */
	String getName();
	
	/**
	 * Called when new bytes were read from the input buffer. The number of
	 * bytes in the passed array is determined by the value returned from the
	 * <code>toRead</code> method that was called recently.
	 * <p>
	 * The passed array can be safely stored or modified by this method as it
	 * will not be used by the caller.
	 * 
	 * @param data
	 *            bytes that was read from the input buffer.
	 */
	void read(byte[] data);
	
	/**
	 * Called to notify about a change of the associated session state.
	 * 
	 * @param event
	 *            an event related with the change of the session state
	 * @see SessionEvent
	 */
	void event(SessionEvent event);
	
	/**
	 * Called to notify about an I/O operation.
	 * 
	 * @param event
	 *            an event related with the type of I/O operation
	 * @param length
	 *            the number of bytes related with the I/O operation
	 * @see DataEvent
	 */
	void event(DataEvent event, long length);
	
	/**
	 * Called to notify about an exception caught during processing the I/O
	 * operations. This method can, by the returned value, inform the caller not
	 * to close the associated session what is the default action after catching
	 * an exception.
	 * 
	 * @param t
	 *            the exception caught
	 * @return <code>true</code> to inform the caller not to perform the default
	 *         action.
	 */
	boolean exception(Throwable t);
	
	/**
	 * Returns the factory object that will be used to configure the internal
	 * structure of the associated session.
	 * 
	 * @return the factory object
	 * @see ISessionStructureFactory
	 */
	ISessionStructureFactory getFactory();
	
	/**
	 * Returns the configuration object that will be used to configure the
	 * behavior of the associated session.
	 * 
	 * @return the configuration object
	 * @see ISessionConfig
	 */
	ISessionConfig getConfig();
}