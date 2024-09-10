package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.model.PromoOfferParamsDTO;
import org.openapitools.model.PromoOfferParticipationStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Товар, который участвует или может участвовать в акции.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Товар, который участвует или может участвовать в акции.")
public class GetPromoOfferDTO   {
  
  private String offerId;

  private PromoOfferParticipationStatusType status;

  private PromoOfferParamsDTO params;

  private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public GetPromoOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  /**
   **/
  public GetPromoOfferDTO status(PromoOfferParticipationStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public PromoOfferParticipationStatusType getStatus() {
    return status;
  }
  public void setStatus(PromoOfferParticipationStatusType status) {
    this.status = status;
  }


  /**
   **/
  public GetPromoOfferDTO params(PromoOfferParamsDTO params) {
    this.params = params;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("params")
  @NotNull
  public PromoOfferParamsDTO getParams() {
    return params;
  }
  public void setParams(PromoOfferParamsDTO params) {
    this.params = params;
  }


  /**
   **/
  public GetPromoOfferDTO autoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails) {
    this.autoParticipatingDetails = autoParticipatingDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

