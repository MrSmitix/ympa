package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedbackDeliveryType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о заказе, указанная в отзыве.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackOrderDTO   {
  
  private String shopOrderId;
  private FeedbackDeliveryType delivery;

  /**
   * Номер заказа, указанный в отзыве.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("delivery")
  @Valid
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

