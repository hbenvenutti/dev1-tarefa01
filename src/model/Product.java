package model;

public class Product {
  private String name;
  private int total;

  public Product(String name, int total) {
    this.name = name;
    this.total = total;

    return;
  }  

  public String getName() {
    return name;
  }

  public int getTotal() {
    return total;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
