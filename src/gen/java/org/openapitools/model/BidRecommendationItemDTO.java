package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Рекомендованная ставка и возможная доля показов.
 */
@ApiModel(description="Рекомендованная ставка и возможная доля показов.")

public class BidRecommendationItemDTO  {
  
 /**
  * Значение ставки.
  */
  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
  private Integer bid;

 /**
  * Доля показов. 
  */
  @ApiModelProperty(required = true, value = "Доля показов. ")
  private Long showPercent;
 /**
  * Значение ставки.
  * minimum: 0
  * maximum: 9999
  * @return bid
  */
  @JsonProperty("bid")
  @NotNull
 @Min(0) @Max(9999)  public Integer getBid() {
    return bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
 public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
  public BidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
  * Доля показов. 
  * minimum: 0
  * maximum: 100
  * @return showPercent
  */
  @JsonProperty("showPercent")
  @NotNull
 @Min(0L) @Max(100L)  public Long getShowPercent() {
    return showPercent;
  }

  /**
   * Sets the <code>showPercent</code> property.
   */
 public void setShowPercent(Long showPercent) {
    this.showPercent = showPercent;
  }

  /**
   * Sets the <code>showPercent</code> property.
   */
  public BidRecommendationItemDTO showPercent(Long showPercent) {
    this.showPercent = showPercent;
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
    BidRecommendationItemDTO bidRecommendationItemDTO = (BidRecommendationItemDTO) o;
    return Objects.equals(this.bid, bidRecommendationItemDTO.bid) &&
        Objects.equals(this.showPercent, bidRecommendationItemDTO.showPercent);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

