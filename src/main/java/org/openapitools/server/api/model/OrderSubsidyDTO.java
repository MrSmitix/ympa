package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.OrderSubsidyType;

/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderSubsidyDTO   {
  
  private OrderSubsidyType type;
  private BigDecimal amount;

  public OrderSubsidyDTO () {

  }

  public OrderSubsidyDTO (OrderSubsidyType type, BigDecimal amount) {
    this.type = type;
    this.amount = amount;
  }

    
  @JsonProperty("type")
  public OrderSubsidyType getType() {
    return type;
  }
  public void setType(OrderSubsidyType type) {
    this.type = type;
  }

    
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
    OrderSubsidyDTO orderSubsidyDTO = (OrderSubsidyDTO) o;
    return Objects.equals(type, orderSubsidyDTO.type) &&
        Objects.equals(amount, orderSubsidyDTO.amount);
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
