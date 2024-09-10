package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о трек-номере посылки (DBS).
 */
@ApiModel(description="Информация о трек-номере посылки (DBS).")

public class OrderTrackDTO  {
  
 /**
  * Трек‑номер посылки.
  */
  @ApiModelProperty(value = "Трек‑номер посылки.")
  private String trackCode;

 /**
  * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  */
  @ApiModelProperty(value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  private Long deliveryServiceId;
 /**
  * Трек‑номер посылки.
  * @return trackCode
  */
  @JsonProperty("trackCode")
  public String getTrackCode() {
    return trackCode;
  }

  /**
   * Sets the <code>trackCode</code> property.
   */
 public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  /**
   * Sets the <code>trackCode</code> property.
   */
  public OrderTrackDTO trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }

 /**
  * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  * @return deliveryServiceId
  */
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
 public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
  public OrderTrackDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
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
    OrderTrackDTO orderTrackDTO = (OrderTrackDTO) o;
    return Objects.equals(this.trackCode, orderTrackDTO.trackCode) &&
        Objects.equals(this.deliveryServiceId, orderTrackDTO.deliveryServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackCode, deliveryServiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTrackDTO {\n");
    
    sb.append("    trackCode: ").append(toIndentedString(trackCode)).append("\n");
    sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
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

