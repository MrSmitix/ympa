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

import java.math.BigDecimal;
import org.openapitools.client.model.OrderItemSubsidyType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 **/
@ApiModel(description = "Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. ")
public class OrderItemSubsidyDTO {
  
  @SerializedName("type")
  private OrderItemSubsidyType type = null;
  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderItemSubsidyType getType() {
    return type;
  }
  public void setType(OrderItemSubsidyType type) {
    this.type = type;
  }

  /**
   * Сумма субсидии.
   **/
  @ApiModelProperty(value = "Сумма субсидии.")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemSubsidyDTO orderItemSubsidyDTO = (OrderItemSubsidyDTO) o;
    return (this.type == null ? orderItemSubsidyDTO.type == null : this.type.equals(orderItemSubsidyDTO.type)) &&
        (this.amount == null ? orderItemSubsidyDTO.amount == null : this.amount.equals(orderItemSubsidyDTO.amount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemSubsidyDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
