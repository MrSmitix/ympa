package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryTrackCodeRequest   {
  @JsonProperty("trackCode")
  private String trackCode;

  @JsonProperty("deliveryServiceId")
  private Long deliveryServiceId;

  /**
   * Трек‑номер посылки.
   **/
  public SetOrderDeliveryTrackCodeRequest trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Трек‑номер посылки.")
  @JsonProperty("trackCode")
  public String getTrackCode() {
    return trackCode;
  }
  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   **/
  public SetOrderDeliveryTrackCodeRequest deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  @JsonProperty("deliveryServiceId")
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
    SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest = (SetOrderDeliveryTrackCodeRequest) o;
    return Objects.equals(trackCode, setOrderDeliveryTrackCodeRequest.trackCode) &&
        Objects.equals(deliveryServiceId, setOrderDeliveryTrackCodeRequest.deliveryServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackCode, deliveryServiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOrderDeliveryTrackCodeRequest {\n");
    
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

