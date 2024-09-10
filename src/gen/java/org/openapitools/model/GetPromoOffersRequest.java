package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.PromoOfferParticipationStatusFilterType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Получение списка товаров, которые участвуют или могут участвовать в акции.
 **/
@ApiModel(description="Получение списка товаров, которые участвуют или могут участвовать в акции.")

public class GetPromoOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
 /**
   * Идентификатор акции.
  **/
  private String promoId;

  @ApiModelProperty(value = "")
  @Valid
  private PromoOfferParticipationStatusFilterType statusType;
 /**
   * Идентификатор акции.
   * @return promoId
  **/
  @JsonProperty("promoId")
  @NotNull
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public GetPromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

 /**
   * Get statusType
   * @return statusType
  **/
  @JsonProperty("statusType")
  public PromoOfferParticipationStatusFilterType getStatusType() {
    return statusType;
  }

  public void setStatusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
  }

  public GetPromoOffersRequest statusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
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
    GetPromoOffersRequest getPromoOffersRequest = (GetPromoOffersRequest) o;
    return Objects.equals(this.promoId, getPromoOffersRequest.promoId) &&
        Objects.equals(this.statusType, getPromoOffersRequest.statusType);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

