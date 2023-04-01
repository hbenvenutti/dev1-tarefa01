package model;

public class Client {
  private String name;
  private String email;
  private String phone;
  private boolean isActive;

  public Client(String name, String email, String phone) {
    this.isActive = false;
    this.email = email;
    this.name = name;
    this.phone = phone;
    
    return;
  }

  // * --- set ------------------------------------------------------------ * //

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  // * --- get ------------------------------------------------------------ * //
  
  public boolean getIsActive() {
    return isActive;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }
}
