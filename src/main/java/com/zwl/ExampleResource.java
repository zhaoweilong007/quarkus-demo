package com.zwl;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author ZhaoWeiLong
 * @since 2021年7月14日
 */
@Path("/hello")
@Consumes
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

  @Inject
  DemoService demoService;

  @GET
  public String hello() {
    return "Hello RESTEasy";
  }

  @GET
  @Path("/say")
  public String say(@QueryParam("msg") String msg) {
    return demoService.say(msg);
  }

  @GET
  @Path("{id}")
  public String getById(@PathParam("id") Long id) {
    return "this id is" + id;
  }

}