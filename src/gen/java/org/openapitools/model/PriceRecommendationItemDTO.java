package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Рекомендованная цена.
 */
@ApiModel(description="Рекомендованная цена.")

public class PriceRecommendationItemDTO  {
  
 /**
  * Идентификатор кампании.
  */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  private Long campaignId;

 /**
  * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
  */
  @ApiModelProperty(required = true, value = "Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) ")
  @Valid
  private BigDecimal price;
 /**
  * Идентификатор кампании.
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public PriceRecommendationItemDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
  * minimum: 1
  * @return price
  */
  @JsonProperty("price")
  @NotNull
 @DecimalMin("1")  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public PriceRecommendationItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

