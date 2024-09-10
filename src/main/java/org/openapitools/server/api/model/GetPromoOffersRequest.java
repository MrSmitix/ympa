package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.PromoOfferParticipationStatusFilterType;

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoOffersRequest   {
  
  private String promoId;
  private PromoOfferParticipationStatusFilterType statusType;

  public GetPromoOffersRequest () {

  }

  public GetPromoOffersRequest (String promoId, PromoOfferParticipationStatusFilterType statusType) {
    this.promoId = promoId;
    this.statusType = statusType;
  }

    
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

    
  @JsonProperty("statusType")
  public PromoOfferParticipationStatusFilterType getStatusType() {
    return statusType;
  }
  public void setStatusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoOffersRequest getPromoOffersRequest = (GetPromoOffersRequest) o;
    return Objects.equals(promoId, getPromoOffersRequest.promoId) &&
        Objects.equals(statusType, getPromoOffersRequest.statusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, statusType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoOffersRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
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
