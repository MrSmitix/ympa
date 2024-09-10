package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Идентификаторы, которые связаны с отзывом.
 **/
@ApiModel(description = "Идентификаторы, которые связаны с отзывом.")
@JsonTypeName("GoodsFeedbackIdentifiersDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackIdentifiersDTO   {
  private Long orderId;
  private Long modelId;

  /**
   * Идентификатор заказа на Маркете.
   **/
  public GoodsFeedbackIdentifiersDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа на Маркете.")
  @JsonProperty("orderId")
  @NotNull public Long getOrderId() {
    return orderId;
  }

  @JsonProperty("orderId")
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Идентификатор модели товара.
   **/
  public GoodsFeedbackIdentifiersDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор модели товара.")
  @JsonProperty("modelId")
  @NotNull public Long getModelId() {
    return modelId;
  }

  @JsonProperty("modelId")
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

