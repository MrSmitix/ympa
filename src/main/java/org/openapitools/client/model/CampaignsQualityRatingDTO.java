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
import org.openapitools.client.model.CampaignQualityRatingDTO;



/**
  * Информация об индексе качества магазинов.
 **/

public class CampaignsQualityRatingDTO  {
  
 /**
   * Список магазинов c информацией об их индексе качества.
  **/
  private List<CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

 /**
   * Список магазинов c информацией об их индексе качества.
   * @return campaignRatings
  **/
  public List<CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }

  /**
    * Set campaignRatings
  **/
  public void setCampaignRatings(List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }

  public CampaignsQualityRatingDTO campaignRatings(List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
    return this;
  }

  public CampaignsQualityRatingDTO addCampaignRatingsItem(CampaignQualityRatingDTO campaignRatingsItem) {
    this.campaignRatings.add(campaignRatingsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsQualityRatingDTO {\n");
    
    sb.append("    campaignRatings: ").append(toIndentedString(campaignRatings)).append("\n");
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
