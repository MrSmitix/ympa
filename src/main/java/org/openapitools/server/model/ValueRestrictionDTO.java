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
import org.openapitools.server.model.OptionValuesLimitedDTO;
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
  * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
  */

public class ValueRestrictionDTO  {
  
 /**
  * Идентификатор ограничивающей характеристики.
  */
  @JsonbProperty("limitingParameterId")
  private Long limitingParameterId;

 /**
  * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  */
  @JsonbProperty("limitedValues")
  private List<OptionValuesLimitedDTO> limitedValues = new ArrayList<>();

  /**
   * Идентификатор ограничивающей характеристики.
   * @return limitingParameterId
   **/
  public Long getLimitingParameterId() {
    return limitingParameterId;
  }

  /**
   * Set limitingParameterId
   */
  public void setLimitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
  }

  public ValueRestrictionDTO limitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
    return this;
  }

  /**
   * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
   * @return limitedValues
   **/
  public List<OptionValuesLimitedDTO> getLimitedValues() {
    return limitedValues;
  }

  /**
   * Set limitedValues
   */
  public void setLimitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
  }

  public ValueRestrictionDTO limitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
    return this;
  }

  public ValueRestrictionDTO addLimitedValuesItem(OptionValuesLimitedDTO limitedValuesItem) {
    if (this.limitedValues == null) {
      this.limitedValues = new ArrayList<>();
    }
    this.limitedValues.add(limitedValuesItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueRestrictionDTO {\n");
    
    sb.append("    limitingParameterId: ").append(toIndentedString(limitingParameterId)).append("\n");
    sb.append("    limitedValues: ").append(toIndentedString(limitedValues)).append("\n");
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

