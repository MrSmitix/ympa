package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RejectedPromoOfferDeleteReasonType;

/**
 * Информация о товаре и ошибки, которые появились при его удалении.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RejectedPromoOfferDeleteDTO   {
  
  private String offerId;
  private RejectedPromoOfferDeleteReasonType reason;

  public RejectedPromoOfferDeleteDTO () {

  }

  public RejectedPromoOfferDeleteDTO (String offerId, RejectedPromoOfferDeleteReasonType reason) {
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
  public RejectedPromoOfferDeleteReasonType getReason() {
    return reason;
  }
  public void setReason(RejectedPromoOfferDeleteReasonType reason) {
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
    RejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO = (RejectedPromoOfferDeleteDTO) o;
    return Objects.equals(offerId, rejectedPromoOfferDeleteDTO.offerId) &&
        Objects.equals(reason, rejectedPromoOfferDeleteDTO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedPromoOfferDeleteDTO {\n");
    
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
