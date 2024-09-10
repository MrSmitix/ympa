package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Рекомендованная ставка и возможная доля показов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidRecommendationItemDTO   {
  
  private Integer bid;
  private Long showPercent;

  public BidRecommendationItemDTO () {

  }

  public BidRecommendationItemDTO (Integer bid, Long showPercent) {
    this.bid = bid;
    this.showPercent = showPercent;
  }

    
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

    
  @JsonProperty("showPercent")
  public Long getShowPercent() {
    return showPercent;
  }
  public void setShowPercent(Long showPercent) {
    this.showPercent = showPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidRecommendationItemDTO bidRecommendationItemDTO = (BidRecommendationItemDTO) o;
    return Objects.equals(bid, bidRecommendationItemDTO.bid) &&
        Objects.equals(showPercent, bidRecommendationItemDTO.showPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, showPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidRecommendationItemDTO {\n");
    
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    showPercent: ").append(toIndentedString(showPercent)).append("\n");
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
