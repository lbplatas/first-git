package es.qc.api.apicore.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.qc.api.apicore.service.business.user.IUserService;
import es.qc.api.apicore.service.business.user.bean.User;

@Component
@RestController
public class UserController implements InitializingBean {
    
    @Inject
    private IUserService userService;
    
    @Value("${api.version}")
    private String version;
    
    @RequestMapping(value="/version", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getVersion(){
       return version;
    }
    
    @RequestMapping(value="/users", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers(){
       return userService.getUsers();
    }
    
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(this.userService, "'userService' can't be NULL");
    }

}
