package apimodels;

import apimodels.RegionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Регион доставки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RegionDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("type")
  @NotNull
@Valid

  private RegionType type;

  @JsonProperty("parent")
  @Valid

  private RegionDTO parent;

  @JsonProperty("children")
  @Valid

  private List<@Valid RegionDTO> children = null;

  public RegionDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор региона.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
  public RegionDTO getParent() {
    return parent;
  }

  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

  public RegionDTO children(List<@Valid RegionDTO> children) {
    this.children = children;
    return this;
  }

  public RegionDTO addChildrenItem(RegionDTO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Дочерние регионы.
   * @return children
  **/
  public List<@Valid RegionDTO> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid RegionDTO> children) {
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
    return Objects.equals(id, regionDTO.id) &&
        Objects.equals(name, regionDTO.name) &&
        Objects.equals(type, regionDTO.type) &&
        Objects.equals(parent, regionDTO.parent) &&
        Objects.equals(children, regionDTO.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, parent, children);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

