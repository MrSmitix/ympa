package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.FeedbackDeliveryType;

/**
 * Информация о заказе, указанная в отзыве.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackOrderDTO   {
  
  private String shopOrderId;
  private FeedbackDeliveryType delivery;

  public FeedbackOrderDTO () {

  }

  public FeedbackOrderDTO (String shopOrderId, FeedbackDeliveryType delivery) {
    this.shopOrderId = shopOrderId;
    this.delivery = delivery;
  }

    
  @JsonProperty("shopOrderId")
  public String getShopOrderId() {
    return shopOrderId;
  }
  public void setShopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
  }

    
  @JsonProperty("delivery")
  public FeedbackDeliveryType getDelivery() {
    return delivery;
  }
  public void setDelivery(FeedbackDeliveryType delivery) {
    this.delivery = delivery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackOrderDTO feedbackOrderDTO = (FeedbackOrderDTO) o;
    return Objects.equals(shopOrderId, feedbackOrderDTO.shopOrderId) &&
        Objects.equals(delivery, feedbackOrderDTO.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopOrderId, delivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackOrderDTO {\n");
    
    sb.append("    shopOrderId: ").append(toIndentedString(shopOrderId)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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
