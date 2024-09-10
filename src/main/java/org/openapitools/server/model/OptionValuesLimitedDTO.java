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
  * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
  */

public class OptionValuesLimitedDTO  {
  
 /**
  * Идентификатор значения ограничивающей характеристики.
  */
  @JsonbProperty("limitingOptionValueId")
  private Long limitingOptionValueId;

 /**
  * Идентификаторы допустимых значений ограничиваемой характеристики. 
  */
  @JsonbProperty("optionValueIds")
  private List<Long> optionValueIds = new ArrayList<>();

  /**
   * Идентификатор значения ограничивающей характеристики.
   * @return limitingOptionValueId
   **/
  public Long getLimitingOptionValueId() {
    return limitingOptionValueId;
  }

  /**
   * Set limitingOptionValueId
   */
  public void setLimitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
  }

  public OptionValuesLimitedDTO limitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
    return this;
  }

  /**
   * Идентификаторы допустимых значений ограничиваемой характеристики. 
   * @return optionValueIds
   **/
  public List<Long> getOptionValueIds() {
    return optionValueIds;
  }

  /**
   * Set optionValueIds
   */
  public void setOptionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
  }

  public OptionValuesLimitedDTO optionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
    return this;
  }

  public OptionValuesLimitedDTO addOptionValueIdsItem(Long optionValueIdsItem) {
    if (this.optionValueIds == null) {
      this.optionValueIds = new ArrayList<>();
    }
    this.optionValueIds.add(optionValueIdsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionValuesLimitedDTO {\n");
    
    sb.append("    limitingOptionValueId: ").append(toIndentedString(limitingOptionValueId)).append("\n");
    sb.append("    optionValueIds: ").append(toIndentedString(optionValueIds)).append("\n");
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

