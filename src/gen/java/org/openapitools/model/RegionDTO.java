package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RegionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Регион доставки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Регион доставки.")
public class RegionDTO   {
  
  private Long id;

  private String name;

  private RegionType type;

  private RegionDTO parent;

  private List<@Valid RegionDTO> children;

  /**
   * Идентификатор региона.
   **/
  public RegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор региона.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Название региона.
   **/
  public RegionDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название региона.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public RegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }


  /**
   **/
  public RegionDTO parent(RegionDTO parent) {
    this.parent = parent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parent")
  public RegionDTO getParent() {
    return parent;
  }
  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }


  /**
   * Дочерние регионы.
   **/
  public RegionDTO children(List<@Valid RegionDTO> children) {
    this.children = children;
    return this;
  }

  
  @ApiModelProperty(value = "Дочерние регионы.")
  @JsonProperty("children")
  public List<@Valid RegionDTO> getChildren() {
    return children;
  }
  public void setChildren(List<@Valid RegionDTO> children) {
    this.children = children;
  }

  public RegionDTO addChildrenItem(RegionDTO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

