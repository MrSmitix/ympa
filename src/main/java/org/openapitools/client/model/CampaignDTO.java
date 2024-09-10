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
import org.openapitools.client.model.BusinessDTO;
import org.openapitools.client.model.PlacementType;



/**
  * Информация о магазине.
 **/

public class CampaignDTO  {
  
 /**
   * URL магазина.
  **/
  private String domain;

 /**
   * Идентификатор кампании.
  **/
  private Long id;

 /**
   * Идентификатор плательщика в Яндекс Балансе.
  **/
  private Long clientId;

  private BusinessDTO business;

  private PlacementType placementType;

 /**
   * URL магазина.
   * @return domain
  **/
  public String getDomain() {
    return domain;
  }

  /**
    * Set domain
  **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  public CampaignDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

 /**
   * Идентификатор кампании.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public CampaignDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Идентификатор плательщика в Яндекс Балансе.
   * @return clientId
  **/
  public Long getClientId() {
    return clientId;
  }

  /**
    * Set clientId
  **/
  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public CampaignDTO clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Get business
   * @return business
  **/
  public BusinessDTO getBusiness() {
    return business;
  }

  /**
    * Set business
  **/
  public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

  public CampaignDTO business(BusinessDTO business) {
    this.business = business;
    return this;
  }

 /**
   * Get placementType
   * @return placementType
  **/
  public PlacementType getPlacementType() {
    return placementType;
  }

  /**
    * Set placementType
  **/
  public void setPlacementType(PlacementType placementType) {
    this.placementType = placementType;
  }

  public CampaignDTO placementType(PlacementType placementType) {
    this.placementType = placementType;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDTO {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
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

