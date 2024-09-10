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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Регион доставки.
 */
@ApiModel(description="Регион доставки.")

public class RegionDTO  {
  
 /**
  * Идентификатор региона.
  */
  @ApiModelProperty(value = "Идентификатор региона.")
  private Long id;

 /**
  * Название региона.
  */
  @ApiModelProperty(required = true, value = "Название региона.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RegionType type;

  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO parent;

 /**
  * Дочерние регионы.
  */
  @ApiModelProperty(value = "Дочерние регионы.")
  @Valid
  private List<@Valid RegionDTO> children;
 /**
  * Идентификатор региона.
  * @return id
  */
  @JsonProperty("id")
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
  public RegionDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название региона.
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
  public RegionDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public RegionType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(RegionType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

 /**
  * Get parent
  * @return parent
  */
  @JsonProperty("parent")
  public RegionDTO getParent() {
    return parent;
  }

  /**
   * Sets the <code>parent</code> property.
   */
 public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

  /**
   * Sets the <code>parent</code> property.
   */
  public RegionDTO parent(RegionDTO parent) {
    this.parent = parent;
    return this;
  }

 /**
  * Дочерние регионы.
  * @return children
  */
  @JsonProperty("children")
  public List<@Valid RegionDTO> getChildren() {
    return children;
  }

  /**
   * Sets the <code>children</code> property.
   */
 public void setChildren(List<@Valid RegionDTO> children) {
    this.children = children;
  }

  /**
   * Sets the <code>children</code> property.
   */
  public RegionDTO children(List<@Valid RegionDTO> children) {
    this.children = children;
    return this;
  }

  /**
   * Adds a new item to the <code>children</code> list.
   */
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

