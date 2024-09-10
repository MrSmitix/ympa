package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.model.PromoOfferParamsDTO;
import org.openapitools.model.PromoOfferParticipationStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Товар, который участвует или может участвовать в акции.
 */

@Schema(name = "GetPromoOfferDTO", description = "Товар, который участвует или может участвовать в акции.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOfferDTO {

  private String offerId;

  private PromoOfferParticipationStatusType status;

  private PromoOfferParamsDTO params;

  private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;

  public GetPromoOfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromoOfferDTO(String offerId, PromoOfferParticipationStatusType status, PromoOfferParamsDTO params) {
    this.offerId = offerId;
    this.status = status;
    this.params = params;
  }

  public GetPromoOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public GetPromoOfferDTO status(PromoOfferParticipationStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public PromoOfferParticipationStatusType getStatus() {
    return status;
  }

  public void setStatus(PromoOfferParticipationStatusType status) {
    this.status = status;
  }

  public GetPromoOfferDTO params(PromoOfferParamsDTO params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
   */
  @NotNull @Valid 
  @Schema(name = "params", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("params")
  public PromoOfferParamsDTO getParams() {
    return params;
  }

  public void setParams(PromoOfferParamsDTO params) {
    this.params = params;
  }

  public GetPromoOfferDTO autoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.autoParticipatingDetails = autoParticipatingDetails;
    return this;
  }

  /**
   * Get autoParticipatingDetails
   * @return autoParticipatingDetails
   */
  @Valid 
  @Schema(name = "autoParticipatingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.offerId, getPromoOfferDTO.offerId) &&
        Objects.equals(this.status, getPromoOfferDTO.status) &&
        Objects.equals(this.params, getPromoOfferDTO.params) &&
        Objects.equals(this.autoParticipatingDetails, getPromoOfferDTO.autoParticipatingDetails);
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

