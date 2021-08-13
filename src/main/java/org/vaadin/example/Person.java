package org.vaadin.example;

/**
 * POJO for random data
 */
public class Person {
  String first;
  Integer id;
  /**
   * @param first the first to set
   */
  public void setFirst(String first) {
    this.first = first;
  }
  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }
  /**
   * @return the first
   */
  public String getFirst() {
    return first;
  }
  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }
}