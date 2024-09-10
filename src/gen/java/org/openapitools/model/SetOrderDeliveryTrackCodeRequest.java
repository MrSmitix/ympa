package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetOrderDeliveryTrackCodeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryTrackCodeRequest   {
  private String trackCode;
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
  @NotNull public String getTrackCode() {
    return trackCode;
  }

  @JsonProperty("trackCode")
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
  @NotNull public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  @JsonProperty("deliveryServiceId")
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
    return Objects.equals(this.trackCode, setOrderDeliveryTrackCodeRequest.trackCode) &&
        Objects.equals(this.deliveryServiceId, setOrderDeliveryTrackCodeRequest.deliveryServiceId);
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

