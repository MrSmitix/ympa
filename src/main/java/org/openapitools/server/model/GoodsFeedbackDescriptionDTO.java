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
  * Текстовая часть отзыва.
  */

public class GoodsFeedbackDescriptionDTO  {
  
 /**
  * Описание плюсов товара в отзыве.
  */
  @JsonbProperty("advantages")
  private String advantages;

 /**
  * Описание минусов товара в отзыве.
  */
  @JsonbProperty("disadvantages")
  private String disadvantages;

 /**
  * Комментарий в отзыве.
  */
  @JsonbProperty("comment")
  private String comment;

  /**
   * Описание плюсов товара в отзыве.
   * @return advantages
   **/
  public String getAdvantages() {
    return advantages;
  }

  /**
   * Set advantages
   */
  public void setAdvantages(String advantages) {
    this.advantages = advantages;
  }

  public GoodsFeedbackDescriptionDTO advantages(String advantages) {
    this.advantages = advantages;
    return this;
  }

  /**
   * Описание минусов товара в отзыве.
   * @return disadvantages
   **/
  public String getDisadvantages() {
    return disadvantages;
  }

  /**
   * Set disadvantages
   */
  public void setDisadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
  }

  public GoodsFeedbackDescriptionDTO disadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
    return this;
  }

  /**
   * Комментарий в отзыве.
   * @return comment
   **/
  public String getComment() {
    return comment;
  }

  /**
   * Set comment
   */
  public void setComment(String comment) {
    this.comment = comment;
  }

  public GoodsFeedbackDescriptionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackDescriptionDTO {\n");
    
    sb.append("    advantages: ").append(toIndentedString(advantages)).append("\n");
    sb.append("    disadvantages: ").append(toIndentedString(disadvantages)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

