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

import java.nio.ByteBuffer;

import org.snf4j.core.handler.IDatagramHandler;

public class TestDatagramSession extends DatagramSession {

	public volatile boolean getInBufferException;
	
	public volatile boolean calculateThroughputException;
	
	public TestDatagramSession(String name, IDatagramHandler handler) {
		super(name, handler);
	}

	public TestDatagramSession(IDatagramHandler handler) {
		super(handler);
	}
	
	@Override
	ByteBuffer getInBuffer() {
		if (getInBufferException) {
			throw new IllegalStateException();
		}
		return super.getInBuffer();
	}	

	@Override
	void calculateThroughput(long currentTime, boolean force) {
		if (calculateThroughputException) {
			throw new IllegalStateException();
		}
		super.calculateThroughput(currentTime, force);
	}
}
