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
import org.openapitools.client.model.OrderSubsidyType;



/**
  * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 **/

public class OrderSubsidyDTO  {
  
  private OrderSubsidyType type;

 /**
   * Сумма субсидии.
  **/
  private BigDecimal amount;

 /**
   * Get type
   * @return type
  **/
  public OrderSubsidyType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(OrderSubsidyType type) {
    this.type = type;
  }

  public OrderSubsidyDTO type(OrderSubsidyType type) {
    this.type = type;
    return this;
  }

 /**
   * Сумма субсидии.
   * @return amount
  **/
  public BigDecimal getAmount() {
    return amount;
  }

  /**
    * Set amount
  **/
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public OrderSubsidyDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSubsidyDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
