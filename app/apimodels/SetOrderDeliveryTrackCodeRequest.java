package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SetOrderDeliveryTrackCodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SetOrderDeliveryTrackCodeRequest   {
  @JsonProperty("trackCode")
  @NotNull

  private String trackCode;

  @JsonProperty("deliveryServiceId")
  @NotNull

  private Long deliveryServiceId;

  public SetOrderDeliveryTrackCodeRequest trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }

   /**
   * Трек‑номер посылки.
   * @return trackCode
  **/
  public String getTrackCode() {
    return trackCode;
  }

  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  public SetOrderDeliveryTrackCodeRequest deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

   /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   * @return deliveryServiceId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

