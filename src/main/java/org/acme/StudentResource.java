package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Counted;

@Path("/student")
public class StudentResource {

    @Counted(name = "status",
            absolute = true,
            tags = "status=full-time")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("fulltime")
    public String fulltime() {
        return "fulltime";
    }

    @Counted(name = "status",
            absolute = true,
            tags = "status=part-time")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("parttime")
    public String parttime() {
        return "parttime";
    }
}