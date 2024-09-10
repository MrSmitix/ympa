package apimodels;

import apimodels.FeedbackDeliveryType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о заказе, указанная в отзыве.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackOrderDTO   {
  @JsonProperty("shopOrderId")
  
  private String shopOrderId;

  @JsonProperty("delivery")
  @Valid

  private FeedbackDeliveryType delivery;

  public FeedbackOrderDTO shopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
    return this;
  }

   /**
   * Номер заказа, указанный в отзыве.
   * @return shopOrderId
  **/
  public String getShopOrderId() {
    return shopOrderId;
  }

  public void setShopOrderId(String shopOrderId) {
    this.shopOrderId = shopOrderId;
  }

  public FeedbackOrderDTO delivery(FeedbackDeliveryType delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

