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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 **/
@ApiModel(description = "Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. ")
public class CategoryDTO {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("children")
  private List<CategoryDTO> children = null;

  /**
   * Идентификатор категории.
   **/
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название категории.
   **/
  @ApiModelProperty(required = true, value = "Название категории.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Дочерние категории.
   **/
  @ApiModelProperty(value = "Дочерние категории.")
  public List<CategoryDTO> getChildren() {
    return children;
  }
  public void setChildren(List<CategoryDTO> children) {
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
    return (this.id == null ? categoryDTO.id == null : this.id.equals(categoryDTO.id)) &&
        (this.name == null ? categoryDTO.name == null : this.name.equals(categoryDTO.name)) &&
        (this.children == null ? categoryDTO.children == null : this.children.equals(categoryDTO.children));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.children == null ? 0: this.children.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  children: ").append(children).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
