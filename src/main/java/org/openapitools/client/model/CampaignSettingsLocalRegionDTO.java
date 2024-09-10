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
import org.openapitools.client.model.CampaignSettingsDeliveryDTO;
import org.openapitools.client.model.CampaignSettingsScheduleSourceType;
import org.openapitools.client.model.RegionType;



/**
  * Информация о своем регионе магазина.
 **/

public class CampaignSettingsLocalRegionDTO  {
  
 /**
   * Идентификатор региона.
  **/
  private Long id;

 /**
   * Название региона.
  **/
  private String name;

  private RegionType type;

  private CampaignSettingsScheduleSourceType deliveryOptionsSource;

  private CampaignSettingsDeliveryDTO delivery;

 /**
   * Идентификатор региона.
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

  public CampaignSettingsLocalRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название региона.
   * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public CampaignSettingsLocalRegionDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public RegionType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(RegionType type) {
    this.type = type;
  }

  public CampaignSettingsLocalRegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

 /**
   * Get deliveryOptionsSource
   * @return deliveryOptionsSource
  **/
  public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
    return deliveryOptionsSource;
  }

  /**
    * Set deliveryOptionsSource
  **/
  public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
  }

  public CampaignSettingsLocalRegionDTO deliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
    return this;
  }

 /**
   * Get delivery
   * @return delivery
  **/
  public CampaignSettingsDeliveryDTO getDelivery() {
    return delivery;
  }

  /**
    * Set delivery
  **/
  public void setDelivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public CampaignSettingsLocalRegionDTO delivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsLocalRegionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deliveryOptionsSource: ").append(toIndentedString(deliveryOptionsSource)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

