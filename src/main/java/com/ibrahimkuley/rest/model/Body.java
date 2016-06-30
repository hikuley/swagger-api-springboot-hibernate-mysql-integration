package com.ibrahimkuley.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T08:21:20.533Z")
public class Body  {
  
  private String name = null;
  private Boolean completed = null;

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
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(name, body.name) &&
        Objects.equals(completed, body.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, completed);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  completed: ").append(completed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
