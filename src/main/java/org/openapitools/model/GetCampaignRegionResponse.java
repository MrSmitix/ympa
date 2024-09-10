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
import org.openapitools.model.RegionDTO;



/**
 * Ответ на запрос региона магазина.
 */

@ApiModel(description = "Ответ на запрос региона магазина.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignRegionResponse   {
  
  private RegionDTO region;

  /**
   */
  public GetCampaignRegionResponse region(RegionDTO region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }
  public void setRegion(RegionDTO region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignRegionResponse getCampaignRegionResponse = (GetCampaignRegionResponse) o;
    return Objects.equals(region, getCampaignRegionResponse.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignRegionResponse {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

