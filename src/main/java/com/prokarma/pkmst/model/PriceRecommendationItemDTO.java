package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Рекомендованная цена.
 */
@ApiModel(description = "Рекомендованная цена.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceRecommendationItemDTO   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("price")
  private BigDecimal price;

  public PriceRecommendationItemDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public PriceRecommendationItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
   * minimum: 1
   * @return price
   */
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
    return Objects.equals(this.campaignId, priceRecommendationItemDTO.campaignId) &&
        Objects.equals(this.price, priceRecommendationItemDTO.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRecommendationItemDTO {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

