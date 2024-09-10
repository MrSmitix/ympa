/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedbackDeliveryType;



/**
 * Информация о заказе, указанная в отзыве.
 */

@ApiModel(description = "Информация о заказе, указанная в отзыве.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackOrderDTO   {
  
  private String shopOrderId;
  private FeedbackDeliveryType delivery;

  /**
   * Номер заказа, указанный в отзыве.
   */
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
   */
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

