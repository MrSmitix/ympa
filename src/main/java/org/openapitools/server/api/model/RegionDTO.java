package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.RegionType;

/**
 * Регион доставки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionDTO   {
  
  private Long id;
  private String name;
  private RegionType type;
  private RegionDTO parent;
  private List<RegionDTO> children;

  public RegionDTO () {

  }

  public RegionDTO (Long id, String name, RegionType type, RegionDTO parent, List<RegionDTO> children) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.parent = parent;
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

    
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }

    
  @JsonProperty("parent")
  public RegionDTO getParent() {
    return parent;
  }
  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

    
  @JsonProperty("children")
  public List<RegionDTO> getChildren() {
    return children;
  }
  public void setChildren(List<RegionDTO> children) {
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
