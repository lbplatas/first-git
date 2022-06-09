package es.qc.api.apicore.service.business.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.qc.api.apicore.service.business.user.IUserService;
import es.qc.api.apicore.service.business.user.bean.User;

@Component
public class UserServiceImpl implements IUserService {
    
    public List<User> getUsers() {
        List<User> output = new ArrayList<User>();
        
        User user = new User();
        user.setName("john");
        user.setUsername("jsmith");
        
        output.add(user);
    
        return output;
    }
}
