package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderItemSubsidyType;



/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 **/

@ApiModel(description = "Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemSubsidyDTO   {
  @JsonProperty("type")
  private OrderItemSubsidyType type;

  @JsonProperty("amount")
  private BigDecimal amount;

  /**
   **/
  public OrderItemSubsidyDTO type(OrderItemSubsidyType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OrderItemSubsidyType getType() {
    return type;
  }
  public void setType(OrderItemSubsidyType type) {
    this.type = type;
  }

  /**
   * Сумма субсидии.
   **/
  public OrderItemSubsidyDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "Сумма субсидии.")
  @JsonProperty("amount")
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
    return Objects.equals(type, orderItemSubsidyDTO.type) &&
        Objects.equals(amount, orderItemSubsidyDTO.amount);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

