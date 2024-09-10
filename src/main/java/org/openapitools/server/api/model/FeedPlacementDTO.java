package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.FeedStatusType;

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedPlacementDTO   {
  
  private FeedStatusType status;
  private Integer totalOffersCount;

  public FeedPlacementDTO () {

  }

  public FeedPlacementDTO (FeedStatusType status, Integer totalOffersCount) {
    this.status = status;
    this.totalOffersCount = totalOffersCount;
  }

    
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("totalOffersCount")
  public Integer getTotalOffersCount() {
    return totalOffersCount;
  }
  public void setTotalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPlacementDTO feedPlacementDTO = (FeedPlacementDTO) o;
    return Objects.equals(status, feedPlacementDTO.status) &&
        Objects.equals(totalOffersCount, feedPlacementDTO.totalOffersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, totalOffersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPlacementDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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
