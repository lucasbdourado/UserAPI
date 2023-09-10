package br.com.lucasbdourado.userapi.resource;

import br.com.lucasbdourado.userapi.domain.User;
import br.com.lucasbdourado.userapi.service.IUserService;
import br.com.lucasbdourado.userapi.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/v1/user")
public class UserResource {

    private final IUserService userService;

    public UserResource() {
        this.userService = new UserService();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers(){
        try{
            List<User> userList = userService.getAll();

            return Response.status(Response.Status.OK).entity(userList).build();
        } catch (SQLException e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
