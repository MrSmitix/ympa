/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о трек-номере посылки (DBS).
 */
@ApiModel(description = "Информация о трек-номере посылки (DBS).")
@JsonPropertyOrder({
  OrderTrackDTO.JSON_PROPERTY_TRACK_CODE,
  OrderTrackDTO.JSON_PROPERTY_DELIVERY_SERVICE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderTrackDTO   {
  public static final String JSON_PROPERTY_TRACK_CODE = "trackCode";
  @JsonProperty(JSON_PROPERTY_TRACK_CODE)
  private String trackCode;

  public static final String JSON_PROPERTY_DELIVERY_SERVICE_ID = "deliveryServiceId";
  @JsonProperty(JSON_PROPERTY_DELIVERY_SERVICE_ID)
  private Long deliveryServiceId;

  public OrderTrackDTO trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }

  /**
   * Трек‑номер посылки.
   * @return trackCode
   **/
  @JsonProperty(value = "trackCode")
  @ApiModelProperty(value = "Трек‑номер посылки.")
  
  public String getTrackCode() {
    return trackCode;
  }

  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  public OrderTrackDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   * @return deliveryServiceId
   **/
  @JsonProperty(value = "deliveryServiceId")
  @ApiModelProperty(value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

