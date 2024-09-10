package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */
@ApiModel(description="Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. ")

public class CategoryDTO  {
  
 /**
  * Идентификатор категории.
  */
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  private Long id;

 /**
  * Название категории.
  */
  @ApiModelProperty(required = true, value = "Название категории.")
  private String name;

 /**
  * Дочерние категории.
  */
  @ApiModelProperty(value = "Дочерние категории.")
  @Valid
  private List<@Valid CategoryDTO> children;
 /**
  * Идентификатор категории.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CategoryDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название категории.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CategoryDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Дочерние категории.
  * @return children
  */
  @JsonProperty("children")
  public List<@Valid CategoryDTO> getChildren() {
    return children;
  }

  /**
   * Sets the <code>children</code> property.
   */
 public void setChildren(List<@Valid CategoryDTO> children) {
    this.children = children;
  }

  /**
   * Sets the <code>children</code> property.
   */
  public CategoryDTO children(List<@Valid CategoryDTO> children) {
    this.children = children;
    return this;
  }

  /**
   * Adds a new item to the <code>children</code> list.
   */
  public CategoryDTO addChildrenItem(CategoryDTO childrenItem) {
    this.children.add(childrenItem);
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDTO categoryDTO = (CategoryDTO) o;
    return Objects.equals(this.id, categoryDTO.id) &&
        Objects.equals(this.name, categoryDTO.name) &&
        Objects.equals(this.children, categoryDTO.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

