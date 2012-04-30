/**
 *
 * (C) Copyright 2008-2011 syslog4j.org
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
package org.productivity.java.syslog4j.impl.backlog;

import org.productivity.java.syslog4j.SyslogBackLogHandlerIF;
import org.productivity.java.syslog4j.SyslogIF;
import org.productivity.java.syslog4j.SyslogLevel;

/**
* NullSyslogBackLogHandler can be used if there's no need for a last-chance
* logging mechanism whenever the Syslog protocol fails.
*
* <p>Syslog4j is licensed under the Lesser GNU Public License v2.1.  A copy
* of the LGPL license is available in the META-INF folder in all
* distributions of Syslog4j and in the base directory of the "doc" ZIP.</p>
*
* @author &lt;syslog4j@productivity.org&gt;
* @version $Id: NullSyslogBackLogHandler.java,v 1.2 2010/10/25 03:50:25 cvs Exp $
*/
public class NullSyslogBackLogHandler implements SyslogBackLogHandlerIF {
    public static final NullSyslogBackLogHandler INSTANCE = new NullSyslogBackLogHandler();

    @Override
    public void initialize() {
        //
    }

    @Override
    public void down(SyslogIF syslog, String reason) {
        //
    }

    @Override
    public void up(SyslogIF syslog) {
        //
    }

    @Override
    public void log(SyslogIF syslog, SyslogLevel level, String message, String reason) {
        //
    }
}
