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
import org.openapitools.client.model.OfferMappingEntryDTO;
import org.openapitools.client.model.ScrollingPagerDTO;



/**
  * Информация о товарах в каталоге.
 **/

public class OfferMappingEntriesDTO  {
  
  private ScrollingPagerDTO paging;

 /**
   * Информация о товарах в каталоге.
  **/
  private List<OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

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

  public OfferMappingEntriesDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Информация о товарах в каталоге.
   * @return offerMappingEntries
  **/
  public List<OfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  /**
    * Set offerMappingEntries
  **/
  public void setOfferMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  public OfferMappingEntriesDTO offerMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public OfferMappingEntriesDTO addOfferMappingEntriesItem(OfferMappingEntryDTO offerMappingEntriesItem) {
    this.offerMappingEntries.add(offerMappingEntriesItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingEntriesDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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

