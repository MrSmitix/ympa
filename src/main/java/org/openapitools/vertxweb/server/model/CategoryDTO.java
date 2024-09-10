package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO   {
  
  private Long id;
  private String name;
  private List<CategoryDTO> children;

  public CategoryDTO () {

  }

  public CategoryDTO (Long id, String name, List<CategoryDTO> children) {
    this.id = id;
    this.name = name;
    this.children = children;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("children")
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
    return Objects.equals(id, categoryDTO.id) &&
        Objects.equals(name, categoryDTO.name) &&
        Objects.equals(children, categoryDTO.children);
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
