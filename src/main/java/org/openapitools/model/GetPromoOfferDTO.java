/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PromoOfferAutoParticipatingDetailsDTO;
import org.openapitools.model.PromoOfferParamsDTO;
import org.openapitools.model.PromoOfferParticipationStatusType;



/**
 * Товар, который участвует или может участвовать в акции.
 */

@ApiModel(description = "Товар, который участвует или может участвовать в акции.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOfferDTO   {
  
  private String offerId;
  private PromoOfferParticipationStatusType status;
  private PromoOfferParamsDTO params;
  private PromoOfferAutoParticipatingDetailsDTO autoParticipatingDetails;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   */
  public GetPromoOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   */
  public GetPromoOfferDTO status(PromoOfferParticipationStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public PromoOfferParticipationStatusType getStatus() {
    return status;
  }
  public void setStatus(PromoOfferParticipationStatusType status) {
    this.status = status;
  }

  /**
   */
  public GetPromoOfferDTO params(PromoOfferParamsDTO params) {
    this.params = params;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("params")
  public PromoOfferParamsDTO getParams() {
    return params;
  }
  public void setParams(PromoOfferParamsDTO params) {
    this.params = params;
  }

  /**
   */
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

