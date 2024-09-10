package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.model.PromoOfferParamsDTO;
import org.openapitools.model.PromoOfferParticipationStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Товар, который участвует или может участвовать в акции.
 */
@ApiModel(description="Товар, который участвует или может участвовать в акции.")

public class GetPromoOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PromoOfferParticipationStatusType status;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PromoOfferParamsDTO params;

  @ApiModelProperty(value = "")
  @Valid
  private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public GetPromoOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public PromoOfferParticipationStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(PromoOfferParticipationStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public GetPromoOfferDTO status(PromoOfferParticipationStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get params
  * @return params
  */
  @JsonProperty("params")
  @NotNull
  public PromoOfferParamsDTO getParams() {
    return params;
  }

  /**
   * Sets the <code>params</code> property.
   */
 public void setParams(PromoOfferParamsDTO params) {
    this.params = params;
  }

  /**
   * Sets the <code>params</code> property.
   */
  public GetPromoOfferDTO params(PromoOfferParamsDTO params) {
    this.params = params;
    return this;
  }

 /**
  * Get autoParticipatingDetails
  * @return autoParticipatingDetails
  */
  @JsonProperty("autoParticipatingDetails")
  public PromoOfferAutoParticipatingDetailsDTO getAutoParticipatingDetails() {
    return autoParticipatingDetails;
  }

  /**
   * Sets the <code>autoParticipatingDetails</code> property.
   */
 public void setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.autoParticipatingDetails = autoParticipatingDetails;
  }

  /**
   * Sets the <code>autoParticipatingDetails</code> property.
   */
  public GetPromoOfferDTO autoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.autoParticipatingDetails = autoParticipatingDetails;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

