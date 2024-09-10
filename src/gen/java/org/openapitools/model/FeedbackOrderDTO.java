package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedbackDeliveryType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о заказе, указанная в отзыве.
 */
@ApiModel(description="Информация о заказе, указанная в отзыве.")

public class FeedbackOrderDTO  {
  
 /**
  * Номер заказа, указанный в отзыве.
  */
  @ApiModelProperty(value = "Номер заказа, указанный в отзыве.")
  private String shopOrderId;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackDeliveryType delivery;
 /**
  * Номер заказа, указанный в отзыве.
  * @return shopOrderId
  */
  @JsonProperty("shopOrderId")
  public String getShopOrderId() {
    return shopOrderId;
  }

  /**
   * Sets the <code>shopOrderId</code> property.
   */
 public void setShopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
  }

  /**
   * Sets the <code>shopOrderId</code> property.
   */
  public FeedbackOrderDTO shopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
    return this;
  }

 /**
  * Get delivery
  * @return delivery
  */
  @JsonProperty("delivery")
  public FeedbackDeliveryType getDelivery() {
    return delivery;
  }

  /**
   * Sets the <code>delivery</code> property.
   */
 public void setDelivery(FeedbackDeliveryType delivery) {
    this.delivery = delivery;
  }

  /**
   * Sets the <code>delivery</code> property.
   */
  public FeedbackOrderDTO delivery(FeedbackDeliveryType delivery) {
    this.delivery = delivery;
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
    FeedbackOrderDTO feedbackOrderDTO = (FeedbackOrderDTO) o;
    return Objects.equals(this.shopOrderId, feedbackOrderDTO.shopOrderId) &&
        Objects.equals(this.delivery, feedbackOrderDTO.delivery);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

