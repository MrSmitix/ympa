package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Рекомендованная ставка и возможная доля показов.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BidRecommendationItemDTO   {
  
  private Integer bid;
  private Long showPercent;

  /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   **/
  
  @ApiModelProperty(example = "570", required = true, value = "Значение ставки.")
  @JsonProperty("bid")
  @NotNull
 @Min(0) @Max(9999)  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Доля показов. 
   * minimum: 0
   * maximum: 100
   **/
  
  @ApiModelProperty(required = true, value = "Доля показов. ")
  @JsonProperty("showPercent")
  @NotNull
 @Min(0L) @Max(100L)  public Long getShowPercent() {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

