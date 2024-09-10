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
import org.openapitools.model.PromoOfferParticipationStatusFilterType;



/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */

@ApiModel(description = "Получение списка товаров, которые участвуют или могут участвовать в акции.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOffersRequest   {
  
  private String promoId;
  private PromoOfferParticipationStatusFilterType statusType;

  /**
   * Идентификатор акции.
   */
  public GetPromoOffersRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("promoId")
  public String getPromoId() {
    return promoId;
  }
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   */
  public GetPromoOffersRequest statusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

