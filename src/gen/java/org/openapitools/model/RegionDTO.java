package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RegionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Регион доставки.
 **/
@ApiModel(description="Регион доставки.")

public class RegionDTO  {
  
  @ApiModelProperty(value = "Идентификатор региона.")
 /**
   * Идентификатор региона.
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Название региона.")
 /**
   * Название региона.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RegionType type;

  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO parent;

  @ApiModelProperty(value = "Дочерние регионы.")
  @Valid
 /**
   * Дочерние регионы.
  **/
  private List<@Valid RegionDTO> children;
 /**
   * Идентификатор региона.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RegionDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название региона.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public RegionType getType() {
    return type;
  }

  public void setType(RegionType type) {
    this.type = type;
  }

  public RegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public RegionDTO getParent() {
    return parent;
  }

  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

  public RegionDTO parent(RegionDTO parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Дочерние регионы.
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid RegionDTO> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid RegionDTO> children) {
    this.children = children;
  }

  public RegionDTO children(List<@Valid RegionDTO> children) {
    this.children = children;
    return this;
  }

  public RegionDTO addChildrenItem(RegionDTO childrenItem) {
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
    RegionDTO regionDTO = (RegionDTO) o;
    return Objects.equals(this.id, regionDTO.id) &&
        Objects.equals(this.name, regionDTO.name) &&
        Objects.equals(this.type, regionDTO.type) &&
        Objects.equals(this.parent, regionDTO.parent) &&
        Objects.equals(this.children, regionDTO.children);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

