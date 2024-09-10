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

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
  */

public class CategoryDTO  {
  
 /**
  * Идентификатор категории.
  */
  @JsonbProperty("id")
  private Long id;

 /**
  * Название категории.
  */
  @JsonbProperty("name")
  private String name;

 /**
  * Дочерние категории.
  */
  @JsonbProperty("children")
  private List<CategoryDTO> children = null;

  /**
   * Идентификатор категории.
   * @return id
   **/
  public Long getId() {
    return id;
  }

  /**
   * Set id
   */
  public void setId(Long id) {
    this.id = id;
  }

  public CategoryDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Название категории.
   * @return name
   **/
  public String getName() {
    return name;
  }

  /**
   * Set name
   */
  public void setName(String name) {
    this.name = name;
  }

  public CategoryDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Дочерние категории.
   * @return children
   **/
  public List<CategoryDTO> getChildren() {
    return children;
  }

  /**
   * Set children
   */
  public void setChildren(List<CategoryDTO> children) {
    this.children = children;
  }

  public CategoryDTO children(List<CategoryDTO> children) {
    this.children = children;
    return this;
  }

  public CategoryDTO addChildrenItem(CategoryDTO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

