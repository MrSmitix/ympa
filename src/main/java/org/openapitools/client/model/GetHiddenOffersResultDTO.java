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
import org.openapitools.client.model.HiddenOfferDTO;
import org.openapitools.client.model.ScrollingPagerDTO;



/**
  * Список скрытых вами товаров. 
 **/

public class GetHiddenOffersResultDTO  {
  
  private ScrollingPagerDTO paging;

 /**
   * Список скрытых товаров.
  **/
  private List<HiddenOfferDTO> hiddenOffers = new ArrayList<>();

 /**
   * Get paging
   * @return paging
  **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
    * Set paging
  **/
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetHiddenOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Список скрытых товаров.
   * @return hiddenOffers
  **/
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  /**
    * Set hiddenOffers
  **/
  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  public GetHiddenOffersResultDTO hiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  public GetHiddenOffersResultDTO addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    this.hiddenOffers.add(hiddenOffersItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHiddenOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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
