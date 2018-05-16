package de.vf.jwt.user.boundry;

import de.vf.jwt.user.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserResource {

    @GET
    public User getUser() {
        return mockUser();
    }

    private User mockUser() {
        User u = new User();
        u.setName("Qasim Ali");
        u.setId(122);
        return u;
    }
}
