package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RegionType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Регион доставки.
 */

@Schema(name = "RegionDTO", description = "Регион доставки.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionDTO {

  private Long id;

  private String name;

  private RegionType type;

  private RegionDTO parent;

  @Valid
  private JsonNullable<List<@Valid RegionDTO>> children = JsonNullable.<List<@Valid RegionDTO>>undefined();

  public RegionDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegionDTO(String name, RegionType type) {
    this.name = name;
    this.type = type;
  }

  public RegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор региона.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RegionDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Название региона.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }

  public void setType(RegionType type) {
    this.type = type;
  }

  public RegionDTO parent(RegionDTO parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public RegionDTO getParent() {
    return parent;
  }

  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

  public RegionDTO children(List<@Valid RegionDTO> children) {
    this.children = JsonNullable.of(children);
    return this;
  }

  public RegionDTO addChildrenItem(RegionDTO childrenItem) {
    if (this.children == null || !this.children.isPresent()) {
      this.children = JsonNullable.of(new ArrayList<>());
    }
    this.children.get().add(childrenItem);
    return this;
  }

  /**
   * Дочерние регионы.
   * @return children
   */
  @Valid 
  @Schema(name = "children", description = "Дочерние регионы.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public JsonNullable<List<@Valid RegionDTO>> getChildren() {
    return children;
  }

  public void setChildren(JsonNullable<List<@Valid RegionDTO>> children) {
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
    RegionDTO regionDTO = (RegionDTO) o;
    return Objects.equals(this.id, regionDTO.id) &&
        Objects.equals(this.name, regionDTO.name) &&
        Objects.equals(this.type, regionDTO.type) &&
        Objects.equals(this.parent, regionDTO.parent) &&
        equalsNullable(this.children, regionDTO.children);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, parent, hashCodeNullable(children));
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
    sb.append("class RegionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

