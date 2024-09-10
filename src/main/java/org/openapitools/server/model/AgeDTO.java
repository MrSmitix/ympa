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

import java.math.BigDecimal;
import org.openapitools.server.model.AgeUnitType;
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
  * Возраст в заданных единицах измерения.
  */

public class AgeDTO  {
  
 /**
  * Значение. 
  */
  @JsonbProperty("value")
  private BigDecimal value;

  @JsonbProperty("ageUnit")
  private AgeUnitType ageUnit;

  /**
   * Значение. 
   * minimum: 0
   * @return value
   **/
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set value
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get ageUnit
   * @return ageUnit
   **/
  public AgeUnitType getAgeUnit() {
    return ageUnit;
  }

  /**
   * Set ageUnit
   */
  public void setAgeUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
  }

  public AgeDTO ageUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ageUnit: ").append(toIndentedString(ageUnit)).append("\n");
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

