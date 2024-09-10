/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RegionType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * Регион доставки.
 **/

public class RegionDTO  {
  
 /**
   * Идентификатор региона.
  **/
  private Long id;

 /**
   * Название региона.
  **/
  private String name;

  private RegionType type;

  private RegionDTO parent;

 /**
   * Дочерние регионы.
  **/
  private List<RegionDTO> children = null;

 /**
   * Идентификатор региона.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
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
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
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
  public RegionType getType() {
    return type;
  }

  /**
    * Set type
  **/
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
  public RegionDTO getParent() {
    return parent;
  }

  /**
    * Set parent
  **/
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
  public List<RegionDTO> getChildren() {
    return children;
  }

  /**
    * Set children
  **/
  public void setChildren(List<RegionDTO> children) {
    this.children = children;
  }

  public RegionDTO children(List<RegionDTO> children) {
    this.children = children;
    return this;
  }

  public RegionDTO addChildrenItem(RegionDTO childrenItem) {
    this.children.add(childrenItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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

