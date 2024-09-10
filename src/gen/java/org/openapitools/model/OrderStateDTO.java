package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация по заказу.
 **/
@ApiModel(description="Информация по заказу.")

public class OrderStateDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "")
  private OrderStatusType status;

  @ApiModelProperty(value = "")
  private OrderSubstatusType substatus;
 /**
   * Идентификатор заказа.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderStateDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderStateDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get substatus
   * @return substatus
  **/
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public OrderStateDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
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
    OrderStateDTO orderStateDTO = (OrderStateDTO) o;
    return Objects.equals(this.id, orderStateDTO.id) &&
        Objects.equals(this.status, orderStateDTO.status) &&
        Objects.equals(this.substatus, orderStateDTO.substatus);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

