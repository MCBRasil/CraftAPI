// $Id$
/*
 * CraftAPI
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

import java.net.*;
import com.sk89q.craftapi.streaming.*;
import com.sk89q.craftapi.event.*;

/**
 *
 * @author sk89q
 */
public class StreamingAPIServerFactory implements StreamingServerFactory {
    /**
     * Event dispatcher.
     */
    private EventDispatcher eventDispatcher;

    /**
     * Construct the object.
     * 
     * @param eventDispatcher
     */
    public StreamingAPIServerFactory(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    /**
     * Construct a client.
     * 
     * @param server
     * @param client
     * @return
     */
    public StreamingServerClient createClient(StreamingServer server,
            Socket sock) throws Throwable {
        return new StreamingAPIServerClient(server, sock, eventDispatcher);
    }
}
