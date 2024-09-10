package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.vertxweb.server.model.PromoOfferParamsDTO;
import org.openapitools.vertxweb.server.model.PromoOfferParticipationStatusType;

/**
 * Товар, который участвует или может участвовать в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoOfferDTO   {
  
  private String offerId;
  private PromoOfferParticipationStatusType status;
  private PromoOfferParamsDTO params;
  private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;

  public GetPromoOfferDTO () {

  }

  public GetPromoOfferDTO (String offerId, PromoOfferParticipationStatusType status, PromoOfferParamsDTO params, PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.offerId = offerId;
    this.status = status;
    this.params = params;
    this.autoParticipatingDetails = autoParticipatingDetails;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("status")
  public PromoOfferParticipationStatusType getStatus() {
    return status;
  }
  public void setStatus(PromoOfferParticipationStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("params")
  public PromoOfferParamsDTO getParams() {
    return params;
  }
  public void setParams(PromoOfferParamsDTO params) {
    this.params = params;
  }

    
  @JsonProperty("autoParticipatingDetails")
  public PromoOfferAutoParticipatingDetailsDTO getAutoParticipatingDetails() {
    return autoParticipatingDetails;
  }
  public void setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.autoParticipatingDetails = autoParticipatingDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoOfferDTO getPromoOfferDTO = (GetPromoOfferDTO) o;
    return Objects.equals(offerId, getPromoOfferDTO.offerId) &&
        Objects.equals(status, getPromoOfferDTO.status) &&
        Objects.equals(params, getPromoOfferDTO.params) &&
        Objects.equals(autoParticipatingDetails, getPromoOfferDTO.autoParticipatingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, status, params, autoParticipatingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    autoParticipatingDetails: ").append(toIndentedString(autoParticipatingDetails)).append("\n");
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
