package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RegionType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Регион доставки.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionDTO   {
  
  private Long id;
  private String name;
  private RegionType type;
  private RegionDTO parent;
  private List<@Valid RegionDTO> children;

  /**
   * Идентификатор региона.
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  @Valid
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parent")
  @Valid
  public RegionDTO getParent() {
    return parent;
  }
  public void setParent(RegionDTO parent) {
    this.parent = parent;
  }

  /**
   * Дочерние регионы.
   **/
  
  @ApiModelProperty(value = "Дочерние регионы.")
  @JsonProperty("children")
  @Valid
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

