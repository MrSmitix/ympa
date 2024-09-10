package apimodels;

import apimodels.OrderStatusType;
import apimodels.OrderSubstatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация по заказу.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderStateDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("status")
  @NotNull
@Valid

  private OrderStatusType status;

  @JsonProperty("substatus")
  @Valid

  private OrderSubstatusType substatus;

  public OrderStateDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор заказа.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderStateDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderStateDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

   /**
   * Get substatus
   * @return substatus
  **/
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStateDTO orderStateDTO = (OrderStateDTO) o;
    return Objects.equals(id, orderStateDTO.id) &&
        Objects.equals(status, orderStateDTO.status) &&
        Objects.equals(substatus, orderStateDTO.substatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, substatus);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStateDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
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

