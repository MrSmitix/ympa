package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Идентификаторы, которые связаны с отзывом.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackIdentifiersDTO   {
  @JsonProperty("orderId")
  @NotNull

  private Long orderId;

  @JsonProperty("modelId")
  @NotNull

  private Long modelId;

  public GoodsFeedbackIdentifiersDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Идентификатор заказа на Маркете.
   * @return orderId
  **/
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
  **/
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
    return Objects.equals(orderId, goodsFeedbackIdentifiersDTO.orderId) &&
        Objects.equals(modelId, goodsFeedbackIdentifiersDTO.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, modelId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

