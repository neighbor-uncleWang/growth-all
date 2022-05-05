package org.wjw.test.dubbo.validation;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class ValidationParamter implements Serializable {
    
    /** 
     * @Fields serialVersionUID TODO 
     */
    
    private static final long serialVersionUID = 32544321432L;
    
    @NotNull
    @Size(min = 2, max = 20)
    private String name;
    
    @Min(18)
    @Max(100)
    private int age;
    
    @Past
    private Date loginDate;
    
    @Future
    private Date expiryDate;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getLoginDate() {
        return loginDate;
    }
    
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    
    public Date getExpiryDate() {
        return expiryDate;
    }
    
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
}
