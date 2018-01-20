package com.example.servicedto;

/**
 * The type User.
 *
 * @author HT
 * @date 2018 -01-20 17:43:04
 */
public class User extends BaseDto{

    /**
     * The Name.
     */
    private String name;
    /**
     * The Password.
     */
    private String password;

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Gets name.
     *
     * @return the name
     * @author HT
     * @date 2018 -01-20 17:43:04
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @author HT
     * @date 2018 -01-20 17:43:04
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets password.
     *
     * @return the password
     * @author HT
     * @date 2018 -01-20 17:43:04
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     * @author HT
     * @date 2018 -01-20 17:43:04
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
