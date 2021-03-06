/*
 * -------------------------------- MIT License --------------------------------
 * 
 * Copyright (c) 2017-2019 SNF4J contributors
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
package org.snf4j.core;

/**
 * An <code>enum</code> that defines actions that are performed by the selector
 * loop after ending a session.
 * 
 * @author <a href="http://snf4j.org">SNF4J.ORG</a>
 */
public enum EndingAction {
	
	/**
	 * No action is performed.
	 */
	DEFAULT,
	
	/**
	 * The selector loop is gently stopped.  
	 */
	STOP,
	
	/**
	 * The selector loop is quickly stopped.  
	 */
	QUICK_STOP,

	/**
	 * The selector loop is quickly stopped in a dirty way.  
	 */
	DIRTY_STOP,
	
	/**
	 * The selector loop will be stopped once all its other sessions are closed.  
	 */
	STOP_WHEN_EMPTY
}
