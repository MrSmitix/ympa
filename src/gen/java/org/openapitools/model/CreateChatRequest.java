package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Заказ, для которого нужно создать чат. 
 **/
@ApiModel(description="Заказ, для которого нужно создать чат. ")

public class CreateChatRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа на Маркете.")
 /**
   * Идентификатор заказа на Маркете.
  **/
  private Long orderId;
 /**
   * Идентификатор заказа на Маркете.
   * @return orderId
  **/
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public CreateChatRequest orderId(Long orderId) {
    this.orderId = orderId;
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
    CreateChatRequest createChatRequest = (CreateChatRequest) o;
    return Objects.equals(this.orderId, createChatRequest.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

