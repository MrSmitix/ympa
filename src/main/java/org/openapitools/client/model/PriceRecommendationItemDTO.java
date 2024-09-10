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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Рекомендованная цена.
 **/
@ApiModel(description = "Рекомендованная цена.")
public class PriceRecommendationItemDTO {
  
  @SerializedName("campaignId")
  private Long campaignId = null;
  @SerializedName("price")
  private BigDecimal price = null;

  /**
   * Идентификатор кампании.
   **/
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) ")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceRecommendationItemDTO priceRecommendationItemDTO = (PriceRecommendationItemDTO) o;
    return (this.campaignId == null ? priceRecommendationItemDTO.campaignId == null : this.campaignId.equals(priceRecommendationItemDTO.campaignId)) &&
        (this.price == null ? priceRecommendationItemDTO.price == null : this.price.equals(priceRecommendationItemDTO.price));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.campaignId == null ? 0: this.campaignId.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRecommendationItemDTO {\n");
    
    sb.append("  campaignId: ").append(campaignId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
