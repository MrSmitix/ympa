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
  * Значение характеристики.
  */

public class ParameterValueOptionDTO  {
  
 /**
  * Идентификатор значения.
  */
  @JsonbProperty("id")
  private Long id;

 /**
  * Значение.
  */
  @JsonbProperty("value")
  private String value;

 /**
  * Описание значения.
  */
  @JsonbProperty("description")
  private String description;

  /**
   * Идентификатор значения.
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

  public ParameterValueOptionDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Значение.
   * @return value
   **/
  public String getValue() {
    return value;
  }

  /**
   * Set value
   */
  public void setValue(String value) {
    this.value = value;
  }

  public ParameterValueOptionDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Описание значения.
   * @return description
   **/
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  public ParameterValueOptionDTO description(String description) {
    this.description = description;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueOptionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

