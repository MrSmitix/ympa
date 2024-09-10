package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.RejectedPromoOfferUpdateReasonType;

/**
 * Описание отклоненного изменения.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RejectedPromoOfferUpdateDTO   {
  
  private String offerId;
  private RejectedPromoOfferUpdateReasonType reason;

  public RejectedPromoOfferUpdateDTO () {

  }

  public RejectedPromoOfferUpdateDTO (String offerId, RejectedPromoOfferUpdateReasonType reason) {
    this.offerId = offerId;
    this.reason = reason;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("reason")
  public RejectedPromoOfferUpdateReasonType getReason() {
    return reason;
  }
  public void setReason(RejectedPromoOfferUpdateReasonType reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO = (RejectedPromoOfferUpdateDTO) o;
    return Objects.equals(offerId, rejectedPromoOfferUpdateDTO.offerId) &&
        Objects.equals(reason, rejectedPromoOfferUpdateDTO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedPromoOfferUpdateDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
