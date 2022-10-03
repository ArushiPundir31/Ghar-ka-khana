package com.gharkakhana.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class Admin{
	@Id
   private String mailId;
    private String password;
    public Admin() {
    super();    
    }
    public Admin(String mailId, String password) {
        super();
        this.mailId = mailId;
        this.password = password;
    }
    public String getmailId() {
        return mailId;
    }
    public void setmailId(String mailId) {
        this.mailId = mailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    
    }



   @Override
    public String toString() {
        return "Admin [mailId=" + mailId + ", password=" + password + "]";
    }

    
}