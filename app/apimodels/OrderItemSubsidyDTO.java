package apimodels;

import apimodels.OrderItemSubsidyType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemSubsidyDTO   {
  @JsonProperty("type")
  @Valid

  private OrderItemSubsidyType type;

  @JsonProperty("amount")
  @Valid

  private BigDecimal amount;

  public OrderItemSubsidyDTO type(OrderItemSubsidyType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OrderItemSubsidyType getType() {
    return type;
  }

  public void setType(OrderItemSubsidyType type) {
    this.type = type;
  }

  public OrderItemSubsidyDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Сумма субсидии.
   * @return amount
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

