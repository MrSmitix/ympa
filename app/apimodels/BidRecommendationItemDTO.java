package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Рекомендованная ставка и возможная доля показов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidRecommendationItemDTO   {
  @JsonProperty("bid")
  @NotNull
@Min(0)
@Max(9999)

  private Integer bid;

  @JsonProperty("showPercent")
  @NotNull
@DecimalMin("0")
@DecimalMax("100")

  private Long showPercent;

  public BidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   * @return bid
  **/
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public BidRecommendationItemDTO showPercent(Long showPercent) {
    this.showPercent = showPercent;
    return this;
  }

   /**
   * Доля показов. 
   * minimum: 0
   * maximum: 100
   * @return showPercent
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

