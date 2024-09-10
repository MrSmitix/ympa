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
import java.math.BigDecimal;



/**
  * Информация о ценах на модель товара.
 **/

public class ModelPriceDTO  {
  
 /**
   * Средняя цена предложения для модели в регионе.
  **/
  private BigDecimal avg;

 /**
   * Максимальная цена предложения для модели в регионе.
  **/
  private BigDecimal max;

 /**
   * Минимальная цена предложения для модели в регионе.
  **/
  private BigDecimal min;

 /**
   * Средняя цена предложения для модели в регионе.
   * @return avg
  **/
  public BigDecimal getAvg() {
    return avg;
  }

  /**
    * Set avg
  **/
  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

  public ModelPriceDTO avg(BigDecimal avg) {
    this.avg = avg;
    return this;
  }

 /**
   * Максимальная цена предложения для модели в регионе.
   * @return max
  **/
  public BigDecimal getMax() {
    return max;
  }

  /**
    * Set max
  **/
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public ModelPriceDTO max(BigDecimal max) {
    this.max = max;
    return this;
  }

 /**
   * Минимальная цена предложения для модели в регионе.
   * @return min
  **/
  public BigDecimal getMin() {
    return min;
  }

  /**
    * Set min
  **/
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public ModelPriceDTO min(BigDecimal min) {
    this.min = min;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPriceDTO {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
