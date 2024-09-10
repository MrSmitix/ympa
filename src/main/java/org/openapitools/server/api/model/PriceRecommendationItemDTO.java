package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Рекомендованная цена.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceRecommendationItemDTO   {
  
  private Long campaignId;
  private BigDecimal price;

  public PriceRecommendationItemDTO () {

  }

  public PriceRecommendationItemDTO (Long campaignId, BigDecimal price) {
    this.campaignId = campaignId;
    this.price = price;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("price")
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
    return Objects.equals(campaignId, priceRecommendationItemDTO.campaignId) &&
        Objects.equals(price, priceRecommendationItemDTO.price);
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
