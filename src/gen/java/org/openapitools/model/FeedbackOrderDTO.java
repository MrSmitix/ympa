package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedbackDeliveryType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о заказе, указанная в отзыве.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о заказе, указанная в отзыве.")
public class FeedbackOrderDTO   {
  
  private String shopOrderId;

  private FeedbackDeliveryType delivery;

  /**
   * Номер заказа, указанный в отзыве.
   **/
  public FeedbackOrderDTO shopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "Номер заказа, указанный в отзыве.")
  @JsonProperty("shopOrderId")
  public String getShopOrderId() {
    return shopOrderId;
  }
  public void setShopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
  }


  /**
   **/
  public FeedbackOrderDTO delivery(FeedbackDeliveryType delivery) {
    this.delivery = delivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

