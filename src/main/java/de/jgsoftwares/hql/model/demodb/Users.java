package de.jgsoftwares.hql.model.demodb;


import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author hoscho
 */

@Entity
@Table(name = "Users")
public class Users implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String email;

    private String password;

    private String role;

    private String username;

    private Integer enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
