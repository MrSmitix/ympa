/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
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



/**
 * Регион доставки.
 */

@ApiModel(description = "Регион доставки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionDTO   {
  
  private Long id;
  private String name;
  private RegionType type;
  private RegionDTO parent;
  private List<RegionDTO> children;

  /**
   * Идентификатор региона.
   */
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
   */
  public RegionDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название региона.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public RegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }

  /**
   */
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
   */
  public RegionDTO children(List<RegionDTO> children) {
    this.children = children;
    return this;
  }

  
  @ApiModelProperty(value = "Дочерние регионы.")
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

