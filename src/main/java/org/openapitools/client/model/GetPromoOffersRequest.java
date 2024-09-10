/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.PromoOfferParticipationStatusFilterType;



/**
  * Получение списка товаров, которые участвуют или могут участвовать в акции.
 **/

public class GetPromoOffersRequest  {
  
 /**
   * Идентификатор акции.
  **/
  private String promoId;

  private PromoOfferParticipationStatusFilterType statusType;

 /**
   * Идентификатор акции.
   * @return promoId
  **/
  public String getPromoId() {
    return promoId;
  }

  /**
    * Set promoId
  **/
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
  public PromoOfferParticipationStatusFilterType getStatusType() {
    return statusType;
  }

  /**
    * Set statusType
  **/
  public void setStatusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
  }

  public GetPromoOffersRequest statusType(PromoOfferParticipationStatusFilterType statusType) {
    this.statusType = statusType;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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

