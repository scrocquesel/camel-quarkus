/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.quarkus.component.langchain4j.tools.it;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.apache.camel.CamelContext;
import org.jboss.logging.Logger;

@Path("/langchain4j-tools")
@ApplicationScoped
public class Langchain4jToolsResource {

    private static final Logger LOG = Logger.getLogger(Langchain4jToolsResource.class);

    private static final String COMPONENT_LANGCHAIN4J_TOOLS = "langchain4j-tools";
    @Inject
    CamelContext context;

    @Path("/load/component/langchain4j-tools")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadComponentLangchain4jTools() throws Exception {
        /* This is an autogenerated test */
        if (context.getComponent(COMPONENT_LANGCHAIN4J_TOOLS) != null) {
            return Response.ok().build();
        }
        LOG.warnf("Could not load [%s] from the Camel context", COMPONENT_LANGCHAIN4J_TOOLS);
        return Response.status(500, COMPONENT_LANGCHAIN4J_TOOLS + " could not be loaded from the Camel context").build();
    }
}
