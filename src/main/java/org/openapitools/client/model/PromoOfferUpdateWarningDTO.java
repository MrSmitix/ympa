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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PromoOfferUpdateWarningCodeType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 **/

public class PromoOfferUpdateWarningDTO  {
  
  private PromoOfferUpdateWarningCodeType code;

 /**
   * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
  **/
  private List<Long> campaignIds = null;

 /**
   * Get code
   * @return code
  **/
  public PromoOfferUpdateWarningCodeType getCode() {
    return code;
  }

  /**
    * Set code
  **/
  public void setCode(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

  public PromoOfferUpdateWarningDTO code(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
    return this;
  }

 /**
   * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
   * @return campaignIds
  **/
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  /**
    * Set campaignIds
  **/
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public PromoOfferUpdateWarningDTO campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public PromoOfferUpdateWarningDTO addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferUpdateWarningDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

