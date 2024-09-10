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
import org.openapitools.client.model.UpdateMappingDTO;
import org.openapitools.client.model.UpdateOfferDTO;



/**
  * Информация о товаре.
 **/

public class UpdateOfferMappingDTO  {
  
  private UpdateOfferDTO offer;

  private UpdateMappingDTO mapping;

 /**
   * Get offer
   * @return offer
  **/
  public UpdateOfferDTO getOffer() {
    return offer;
  }

  /**
    * Set offer
  **/
  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

 /**
   * Get mapping
   * @return mapping
  **/
  public UpdateMappingDTO getMapping() {
    return mapping;
  }

  /**
    * Set mapping
  **/
  public void setMapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
  }

  public UpdateOfferMappingDTO mapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
