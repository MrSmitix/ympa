package apimodels;

import apimodels.PromoOfferParticipationStatusFilterType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromoOffersRequest   {
  @JsonProperty("promoId")
  @NotNull

  private String promoId;

  @JsonProperty("statusType")
  @Valid

  private PromoOfferParticipationStatusFilterType statusType;

  public GetPromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

   /**
   * Идентификатор акции.
   * @return promoId
  **/
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public GetPromoOffersRequest statusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
    return this;
  }

   /**
   * Get statusType
   * @return statusType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

