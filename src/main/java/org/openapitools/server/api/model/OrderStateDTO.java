package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubstatusType;

/**
 * Информация по заказу.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderStateDTO   {
  
  private Long id;
  private OrderStatusType status;
  private OrderSubstatusType substatus;

  public OrderStateDTO () {

  }

  public OrderStateDTO (Long id, OrderStatusType status, OrderSubstatusType substatus) {
    this.id = id;
    this.status = status;
    this.substatus = substatus;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("substatus")
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
