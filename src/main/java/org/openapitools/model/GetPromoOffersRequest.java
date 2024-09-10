package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PromoOfferParticipationStatusFilterType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */

@Schema(name = "GetPromoOffersRequest", description = "Получение списка товаров, которые участвуют или могут участвовать в акции.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOffersRequest {

  private String promoId;

  private PromoOfferParticipationStatusFilterType statusType;

  public GetPromoOffersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromoOffersRequest(String promoId) {
    this.promoId = promoId;
  }

  public GetPromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  /**
   * Идентификатор акции.
   * @return promoId
   */
  @NotNull 
  @Schema(name = "promoId", description = "Идентификатор акции.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("promoId")
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
   */
  @Valid 
  @Schema(name = "statusType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

