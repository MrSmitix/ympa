package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BidRecommendationItemDTO;
import org.openapitools.server.api.model.PriceRecommendationItemDTO;

/**
 * Список товаров с рекомендованными ставками.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SkuBidRecommendationItemDTO   {
  
  private String sku;
  private Integer bid;
  private List<BidRecommendationItemDTO> bidRecommendations;
  private List<PriceRecommendationItemDTO> priceRecommendations;

  public SkuBidRecommendationItemDTO () {

  }

  public SkuBidRecommendationItemDTO (String sku, Integer bid, List<BidRecommendationItemDTO> bidRecommendations, List<PriceRecommendationItemDTO> priceRecommendations) {
    this.sku = sku;
    this.bid = bid;
    this.bidRecommendations = bidRecommendations;
    this.priceRecommendations = priceRecommendations;
  }

    
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

    
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

    
  @JsonProperty("bidRecommendations")
  public List<BidRecommendationItemDTO> getBidRecommendations() {
    return bidRecommendations;
  }
  public void setBidRecommendations(List<BidRecommendationItemDTO> bidRecommendations) {
    this.bidRecommendations = bidRecommendations;
  }

    
  @JsonProperty("priceRecommendations")
  public List<PriceRecommendationItemDTO> getPriceRecommendations() {
    return priceRecommendations;
  }
  public void setPriceRecommendations(List<PriceRecommendationItemDTO> priceRecommendations) {
    this.priceRecommendations = priceRecommendations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuBidRecommendationItemDTO skuBidRecommendationItemDTO = (SkuBidRecommendationItemDTO) o;
    return Objects.equals(sku, skuBidRecommendationItemDTO.sku) &&
        Objects.equals(bid, skuBidRecommendationItemDTO.bid) &&
        Objects.equals(bidRecommendations, skuBidRecommendationItemDTO.bidRecommendations) &&
        Objects.equals(priceRecommendations, skuBidRecommendationItemDTO.priceRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, bid, bidRecommendations, priceRecommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuBidRecommendationItemDTO {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidRecommendations: ").append(toIndentedString(bidRecommendations)).append("\n");
    sb.append("    priceRecommendations: ").append(toIndentedString(priceRecommendations)).append("\n");
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
