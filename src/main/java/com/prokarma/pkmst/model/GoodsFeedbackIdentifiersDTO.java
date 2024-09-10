package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Идентификаторы, которые связаны с отзывом.
 */
@ApiModel(description = "Идентификаторы, которые связаны с отзывом.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackIdentifiersDTO   {
  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("modelId")
  private Long modelId;

  public GoodsFeedbackIdentifiersDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа на Маркете.
   * @return orderId
   */
  @ApiModelProperty(required = true, value = "Идентификатор заказа на Маркете.")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GoodsFeedbackIdentifiersDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Идентификатор модели товара.
   * @return modelId
   */
  @ApiModelProperty(required = true, value = "Идентификатор модели товара.")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

