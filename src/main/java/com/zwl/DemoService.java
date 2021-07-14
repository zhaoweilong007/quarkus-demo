package com.zwl;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author ZhaoWeiLong
 * @since 2021/7/14
 **/
@ApplicationScoped
public class DemoService {

  public String say(String msg) {
    return "hello " + msg;
  }

}
