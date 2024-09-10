package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Идентификаторы, которые связаны с отзывом.
 */
@ApiModel(description="Идентификаторы, которые связаны с отзывом.")

public class GoodsFeedbackIdentifiersDTO  {
  
 /**
  * Идентификатор заказа на Маркете.
  */
  @ApiModelProperty(required = true, value = "Идентификатор заказа на Маркете.")
  private Long orderId;

 /**
  * Идентификатор модели товара.
  */
  @ApiModelProperty(required = true, value = "Идентификатор модели товара.")
  private Long modelId;
 /**
  * Идентификатор заказа на Маркете.
  * @return orderId
  */
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public GoodsFeedbackIdentifiersDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Идентификатор модели товара.
  * @return modelId
  */
  @JsonProperty("modelId")
  @NotNull
  public Long getModelId() {
    return modelId;
  }

  /**
   * Sets the <code>modelId</code> property.
   */
 public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  /**
   * Sets the <code>modelId</code> property.
   */
  public GoodsFeedbackIdentifiersDTO modelId(Long modelId) {
    this.modelId = modelId;
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
    GoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO = (GoodsFeedbackIdentifiersDTO) o;
    return Objects.equals(this.orderId, goodsFeedbackIdentifiersDTO.orderId) &&
        Objects.equals(this.modelId, goodsFeedbackIdentifiersDTO.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, modelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackIdentifiersDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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

