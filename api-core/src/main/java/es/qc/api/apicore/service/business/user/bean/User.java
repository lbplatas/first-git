package es.qc.api.apicore.service.business.user.bean;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * Serial UID
     */
    private static final long serialVersionUID = 7852599200603347533L;
    
    public String name;
     
    public String username;
 
    public User() {
        super();
    }
     
    public User(String name, String username) {
        super();
        this.name = name;
        this.username = username;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
}