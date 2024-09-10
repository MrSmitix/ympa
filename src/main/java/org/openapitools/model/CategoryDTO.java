package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */

@Schema(name = "CategoryDTO", description = "Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryDTO {

  private Long id;

  private String name;

  @Valid
  private JsonNullable<List<@Valid CategoryDTO>> children = JsonNullable.<List<@Valid CategoryDTO>>undefined();

  public CategoryDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public CategoryDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор категории.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "name", description = "Название категории.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryDTO children(List<@Valid CategoryDTO> children) {
    this.children = JsonNullable.of(children);
    return this;
  }

  public CategoryDTO addChildrenItem(CategoryDTO childrenItem) {
    if (this.children == null || !this.children.isPresent()) {
      this.children = JsonNullable.of(new ArrayList<>());
    }
    this.children.get().add(childrenItem);
    return this;
  }

  /**
   * Дочерние категории.
   * @return children
   */
  @Valid 
  @Schema(name = "children", description = "Дочерние категории.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public JsonNullable<List<@Valid CategoryDTO>> getChildren() {
    return children;
  }

  public void setChildren(JsonNullable<List<@Valid CategoryDTO>> children) {
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
        equalsNullable(this.children, categoryDTO.children);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(children));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

