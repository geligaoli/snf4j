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
package org.snf4j.core;

import java.net.SocketAddress;
import java.util.concurrent.ConcurrentMap;

import org.snf4j.core.handler.IDatagramHandler;
import org.snf4j.core.session.IDatagramSession;
import org.snf4j.core.session.ISessionConfig;
import org.snf4j.core.session.SessionState;

public class TestDatagramSession implements IDatagramSession {
	@Override
	public long getId() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public IDatagramHandler getHandler() {
		return null;
	}

	@Override
	public ISessionConfig getConfig() {
		return null;
	}

	@Override
	public SessionState getState() {
		return null;
	}

	@Override
	public boolean isOpen() {
		return false;
	}

	@Override
	public void write(byte[] data) {
	}

	@Override
	public void close() {
	}

	@Override
	public void quickClose() {
	}

	@Override
	public ConcurrentMap<Object, Object> getAttributes() {
		return null;
	}

	@Override
	public SocketAddress getLocalAddress() {
		return null;
	}

	@Override
	public SocketAddress getRemoteAddress() {
		return null;
	}

	@Override
	public void suspendRead() {
	}

	@Override
	public void suspendWrite() {
	}

	@Override
	public void resumeRead() {
	}

	@Override
	public void resumeWrite() {
	}

	@Override
	public boolean isReadSuspended() {
		return false;
	}

	@Override
	public boolean isWriteSuspended() {
		return false;
	}

	@Override
	public long getReadBytes() {
		return 0;
	}

	@Override
	public long getWrittenBytes() {
		return 0;
	}

	@Override
	public double getReadBytesThroughput() {
		return 0;
	}

	@Override
	public double getWrittenBytesThroughput() {
		return 0;
	}

	@Override
	public long getCreationTime() {
		return 0;
	}

	@Override
	public long getLastIoTime() {
		return 0;
	}

	@Override
	public long getLastReadTime() {
		return 0;
	}

	@Override
	public long getLastWriteTime() {
		return 0;
	}

	@Override
	public void write(SocketAddress remoteAddress, byte[] datagram) {
	}

}