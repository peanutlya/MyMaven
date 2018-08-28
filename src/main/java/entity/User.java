package entity;

import java.sql.Timestamp;

public class User {

  private long id;
  private String username;
  private String password;
  private java.sql.Timestamp birthday;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", birthday=" + birthday +
            '}';
  }

  public User() {
  }

  public User(long id, String username, String password, Timestamp birthday) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.birthday = birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }

}
