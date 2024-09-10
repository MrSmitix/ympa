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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignQualityRatingDTO;



/**
 * Информация об индексе качества магазинов.
 */

@ApiModel(description = "Информация об индексе качества магазинов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignsQualityRatingDTO   {
  
  private List<CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

  /**
   * Список магазинов c информацией об их индексе качества.
   */
  public CampaignsQualityRatingDTO campaignRatings(List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список магазинов c информацией об их индексе качества.")
  @JsonProperty("campaignRatings")
  public List<CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }
  public void setCampaignRatings(List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsQualityRatingDTO campaignsQualityRatingDTO = (CampaignsQualityRatingDTO) o;
    return Objects.equals(campaignRatings, campaignsQualityRatingDTO.campaignRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignRatings);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

