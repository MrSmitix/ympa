package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PromoOfferParticipationStatusFilterType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Получение списка товаров, которые участвуют или могут участвовать в акции.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOffersRequest   {
  
  private String promoId;
  private PromoOfferParticipationStatusFilterType statusType;

  /**
   * Идентификатор акции.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("promoId")
  @NotNull
  public String getPromoId() {
    return promoId;
  }
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("statusType")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

