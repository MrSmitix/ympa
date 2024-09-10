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

import java.util.*;
import org.openapitools.client.model.FieldStateType;
import org.openapitools.client.model.PriceCompetitivenessType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetOfferRecommendationsRequest {
  
  @SerializedName("offerIds")
  private List<String> offerIds = null;
  @SerializedName("cofinancePriceFilter")
  private FieldStateType cofinancePriceFilter = null;
  @SerializedName("recommendedCofinancePriceFilter")
  private FieldStateType recommendedCofinancePriceFilter = null;
  @SerializedName("competitivenessFilter")
  private PriceCompetitivenessType competitivenessFilter = null;

  /**
   * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
   **/
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.")
  public List<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldStateType getCofinancePriceFilter() {
    return cofinancePriceFilter;
  }
  public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldStateType getRecommendedCofinancePriceFilter() {
    return recommendedCofinancePriceFilter;
  }
  public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PriceCompetitivenessType getCompetitivenessFilter() {
    return competitivenessFilter;
  }
  public void setCompetitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
    this.competitivenessFilter = competitivenessFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferRecommendationsRequest getOfferRecommendationsRequest = (GetOfferRecommendationsRequest) o;
    return (this.offerIds == null ? getOfferRecommendationsRequest.offerIds == null : this.offerIds.equals(getOfferRecommendationsRequest.offerIds)) &&
        (this.cofinancePriceFilter == null ? getOfferRecommendationsRequest.cofinancePriceFilter == null : this.cofinancePriceFilter.equals(getOfferRecommendationsRequest.cofinancePriceFilter)) &&
        (this.recommendedCofinancePriceFilter == null ? getOfferRecommendationsRequest.recommendedCofinancePriceFilter == null : this.recommendedCofinancePriceFilter.equals(getOfferRecommendationsRequest.recommendedCofinancePriceFilter)) &&
        (this.competitivenessFilter == null ? getOfferRecommendationsRequest.competitivenessFilter == null : this.competitivenessFilter.equals(getOfferRecommendationsRequest.competitivenessFilter));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offerIds == null ? 0: this.offerIds.hashCode());
    result = 31 * result + (this.cofinancePriceFilter == null ? 0: this.cofinancePriceFilter.hashCode());
    result = 31 * result + (this.recommendedCofinancePriceFilter == null ? 0: this.recommendedCofinancePriceFilter.hashCode());
    result = 31 * result + (this.competitivenessFilter == null ? 0: this.competitivenessFilter.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferRecommendationsRequest {\n");
    
    sb.append("  offerIds: ").append(offerIds).append("\n");
    sb.append("  cofinancePriceFilter: ").append(cofinancePriceFilter).append("\n");
    sb.append("  recommendedCofinancePriceFilter: ").append(recommendedCofinancePriceFilter).append("\n");
    sb.append("  competitivenessFilter: ").append(competitivenessFilter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
