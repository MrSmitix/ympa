package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderSubsidyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */
@ApiModel(description = "Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderSubsidyDTO   {
  @JsonProperty("type")
  private OrderSubsidyType type;

  @JsonProperty("amount")
  private BigDecimal amount;

  public OrderSubsidyDTO type(OrderSubsidyType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(value = "")
  public OrderSubsidyType getType() {
    return type;
  }

  public void setType(OrderSubsidyType type) {
    this.type = type;
  }

  public OrderSubsidyDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Сумма субсидии.
   * @return amount
   */
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
    OrderSubsidyDTO orderSubsidyDTO = (OrderSubsidyDTO) o;
    return Objects.equals(this.type, orderSubsidyDTO.type) &&
        Objects.equals(this.amount, orderSubsidyDTO.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

