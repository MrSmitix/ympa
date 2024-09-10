package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrderItemSubsidyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */
@ApiModel(description="Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. ")

public class OrderItemSubsidyDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrderItemSubsidyType type;

 /**
  * Сумма субсидии.
  */
  @ApiModelProperty(value = "Сумма субсидии.")
  @Valid
  private BigDecimal amount;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OrderItemSubsidyType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OrderItemSubsidyType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrderItemSubsidyDTO type(OrderItemSubsidyType type) {
    this.type = type;
    return this;
  }

 /**
  * Сумма субсидии.
  * @return amount
  */
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
 public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
  public OrderItemSubsidyDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
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
    return Objects.equals(this.type, orderItemSubsidyDTO.type) &&
        Objects.equals(this.amount, orderItemSubsidyDTO.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemSubsidyDTO {\n");
    
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

