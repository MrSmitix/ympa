package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */
@ApiModel(description = "Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("children")
  
  private List<CategoryDTO> children = null;

  public CategoryDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CategoryDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название категории.
   * @return name
   */
  @ApiModelProperty(required = true, value = "Название категории.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryDTO children(List<CategoryDTO> children) {
    this.children = children;
    return this;
  }

  public CategoryDTO addChildrenItem(CategoryDTO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Дочерние категории.
   * @return children
   */
  @ApiModelProperty(value = "Дочерние категории.")
  public List<CategoryDTO> getChildren() {
    return children;
  }

  public void setChildren(List<CategoryDTO> children) {
    this.children = children;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

