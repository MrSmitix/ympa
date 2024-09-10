package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация по заказу.
 **/
@ApiModel(description = "Информация по заказу.")
@JsonTypeName("OrderStateDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderStateDTO   {
  private Long id;
  private OrderStatusType status;
  private OrderSubstatusType substatus;

  /**
   * Идентификатор заказа.
   **/
  public OrderStateDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  @JsonProperty("id")
  @NotNull public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public OrderStateDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull public OrderStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   **/
  public OrderStateDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  @JsonProperty("substatus")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

