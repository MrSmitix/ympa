package apimodels;

import apimodels.OrderSubsidyType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderSubsidyDTO   {
  @JsonProperty("type")
  @Valid

  private OrderSubsidyType type;

  @JsonProperty("amount")
  @Valid

  private BigDecimal amount;

  public OrderSubsidyDTO type(OrderSubsidyType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
    OrderSubsidyDTO orderSubsidyDTO = (OrderSubsidyDTO) o;
    return Objects.equals(type, orderSubsidyDTO.type) &&
        Objects.equals(amount, orderSubsidyDTO.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

