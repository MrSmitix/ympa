package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Рекомендованная ставка и возможная доля показов.
 */

@Schema(name = "BidRecommendationItemDTO", description = "Рекомендованная ставка и возможная доля показов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BidRecommendationItemDTO {

  private Integer bid;

  private Long showPercent;

  public BidRecommendationItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BidRecommendationItemDTO(Integer bid, Long showPercent) {
    this.bid = bid;
    this.showPercent = showPercent;
  }

  public BidRecommendationItemDTO bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Значение ставки.
   * minimum: 0
   * maximum: 9999
   * @return bid
   */
  @NotNull @Min(0) @Max(9999) 
  @Schema(name = "bid", example = "570", description = "Значение ставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid")
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
   */
  @NotNull @Min(0L) @Max(100L) 
  @Schema(name = "showPercent", description = "Доля показов. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

