package com.ibrahimkuley.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-07-11T12:23:26.753Z")
public class PersonDto  {
  
  private Integer id = null;
  private String name = null;
  private String surname = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String email = null;
  private Integer age = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * minimum: 0.0
   * maximum: 100.0
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDto personDto = (PersonDto) o;
    return Objects.equals(id, personDto.id) &&
        Objects.equals(name, personDto.name) &&
        Objects.equals(surname, personDto.surname) &&
        Objects.equals(createdAt, personDto.createdAt) &&
        Objects.equals(updatedAt, personDto.updatedAt) &&
        Objects.equals(email, personDto.email) &&
        Objects.equals(age, personDto.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, createdAt, updatedAt, email, age);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDto {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  age: ").append(age).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
